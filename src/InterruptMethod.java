public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("T1 Thread is Running");
            }
        });
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
/*
    t1.interrupt() ==> Sends a signal to t1 thread that it should stop doing what it's doing.



*/