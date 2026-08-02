public class CurrentThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("Worker-1");
        t1.start();
    }
}
