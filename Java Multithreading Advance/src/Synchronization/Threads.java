package Synchronization;

public class Threads extends Thread {
    private Counter counter;

    public Threads(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0 ; i<1000 ; i++){
            counter.increment();
        }
    }
}
