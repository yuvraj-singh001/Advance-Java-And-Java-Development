package ExplicitLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.*;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

//    public synchronized void withdraw(int amount){    //Synchronized will not allow anyone to enter the method untill 1 process is finished.but if it takes to long time without any timeout function then it is a problem.
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl ");
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            balance -= amount;
//
//            System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaining balance " + balance);
//        }
//        else{
//            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
//        }
//    }

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                        try{
                            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl ");
                            Thread.sleep(3000);
                            balance -= amount;
                            System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaining balance " + balance);
                        }catch (Exception e){
                            Thread.currentThread().interrupt();
                        }finally {
                            lock.unlock();
                        }
                    }
                    else{
                        System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                    }
            }else{
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock, try again later");
            }
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
