public class IsAliveMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException err){

            }
        });
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println(t1.isAlive());


    }
}

// isAlive() ==>  start > Thread < terminate (from start to terminate our thread is in alive state) before and after the condition thread is DEAD
