package BasicThreads;

public class ThreadMethods extends Thread {
    public ThreadMethods(String name){
        super(name);
    }
    public void run(){
        for(int i = 0 ; i< 5 ; i++){
        System.out.println(Thread.currentThread().getName() +" Priority " + Thread.currentThread().getPriority() + " count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        to give chance to run other threads
        Thread.yield();
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods("t1");
        ThreadMethods t2 = new ThreadMethods("t2");
//        t1.setPriority(10);\
//        Daemon thread will execute some times and then jvm shuts before full execution.
        t1.isDaemon();
        t1.start();
        t2.start();
//        t1.join();
//        t1.interrupt();

    }
}
