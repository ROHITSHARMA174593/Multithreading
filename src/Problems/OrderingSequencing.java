package Problems;

public class OrderingSequencing {
    /*
     the thing we all assumes wrong -> JVM reads the code line by line -> it's a wrong statement
     becasue JVM apply multiple optimization in our code
    */
    int a = 45;
    int b = 93;

    // it's not necessary a will execute first and after that b will execute
    // JVM can execute any statement first

    // in our JVM there is no ordering
    // it depends on which thing is ready for execution

    // todo: There is no  ordering in variable initialization in Java (because of JVM optimization) (JVM uses multiple algorithms for optimize the Memory initialization)
}
