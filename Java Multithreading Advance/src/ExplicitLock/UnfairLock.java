package ExplicitLock;

import java.util.concurrent.locks.*;

//order == fairness this is unfair lock because executing randomly
//to make it fair write (true) in ReentrantLock , every one get chance to execute (without starvation).

public class UnfairLock {
    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "Acquired the lock");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + "Released the lock");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLock example = new UnfairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 =  new Thread(task, "Thread 1");
        Thread t2 =  new Thread(task, "Thread 2");
        Thread t3 =  new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
