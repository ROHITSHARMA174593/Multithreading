public class ThreadRunning {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Start");

        Thread t1 = new Thread(() -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread-0 started");
        });
        t1.start();
        //t1.join(); // t1 thread complete first -> if t1 takes time than nothing will run after this line
        t1.join(2000); // this line says just wait for 2 seconds if t1 is complete it's work in 2 seconds than okay otherwise don't wait
        System.out.println("Main Thread Ends");
    }
}
