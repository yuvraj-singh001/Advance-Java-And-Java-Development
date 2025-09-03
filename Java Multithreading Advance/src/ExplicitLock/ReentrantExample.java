package ExplicitLock;

import java.util.concurrent.locks.*;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();    //Reentrant lock maintain the count of locks and here 2 locks are used and this will not create the deadlock.

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
