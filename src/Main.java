//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException err){

        }
        System.out.println("Main Thread Ends");
    }
}