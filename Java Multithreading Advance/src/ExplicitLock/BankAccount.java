package ExplicitLock;

public class BankAccount {
    private int balance = 100;

    public void withdraw(int amount){    //Synchronized will not allow anyone to enter the method untill 1 process is finished.but if it takes to long time without any timeout function then it is a problem.
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= amount;

            System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaining balance " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");
        }
    }
}
