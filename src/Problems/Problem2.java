package Problems;

public class Problem2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i=1;i<=1000;i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

class Counter{
    public int count = 0; // this is a shared resource of code because multiple threads share this value
    void increment(){ // this is a critical section
        count++;
    } // if we use synchronized keyword in this method than it will print the real increment -> no matter how many threads update this value
}

//AtomicityProblem => This is not a single problem it divides in 3 small section -> read count, increment count, write count