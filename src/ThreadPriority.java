public class ThreadPriority {
    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            System.out.println("Custom Thread in Running");
//        });
//
//        t1.start();
//        System.out.println(t1.getPriority());
//        t1.setPriority(Thread.MAX_PRIORITY); // or we can say 10
//        System.out.println(t1.getPriority());


        Thread t1 = new Thread(() -> {
            System.out.println("Worker-1 Thread is Running");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Worker-2 Thread is Running");
        });
        t2.setPriority(8);
        t1.start();
        t2.start();
    }
}

/*
    Thread Priority

    3 types of priority
    MAX_PRIORITY = 10
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5


    we cannot decide the priorities, we just send the request to CPU and tells about our priorities (Run the code multiple times for better understanding)
*/
