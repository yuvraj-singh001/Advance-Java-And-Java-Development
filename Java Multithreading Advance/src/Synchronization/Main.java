package Synchronization;

import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Threads t1 = new Threads(counter);
        Threads t2 = new Threads(counter);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }

        System.out.println(counter.getCount());
    }
}
