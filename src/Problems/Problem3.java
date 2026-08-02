package Problems;

public class Problem3 {
    static volatile boolean flag = false; // volatile is basically used for -> where we use this variable always read it from RAM not from any cache

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException err){}

            flag = true;
        });
        Thread t2 = new Thread(() -> {
            while(!flag){ // after using volatile keyword in our flag variable it every time reads from RAM
                // System.out.println("Thread-2 is Running ... "); // if you comment this line than it will run infinitely, because now t2 read flag from t2's cache not from ram, and we are change flag in t1's cache ==> System.out.println() is solve this problem because it is use a synchronized concept internally
            }
            System.out.println("Thread-2 is Finished........");
        });

        //todo: When you change something inside the any thread than the value is changes in thread's cache not in RAM and if you want to use some variables every time from RAM than use volatile keyword
        t1.start();
        t2.start();
    }
}
