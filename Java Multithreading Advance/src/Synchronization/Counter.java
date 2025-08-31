package Synchronization;

public class Counter {
    private int count = 0 ;

//    It is critical section.
    public void increment(){
        synchronized (this){     //for making synchronized a block of code.
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
