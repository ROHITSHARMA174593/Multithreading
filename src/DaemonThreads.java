public class DaemonThreads {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Running");
            }
        });
        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException err) {}




    }
}