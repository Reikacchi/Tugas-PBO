package StaticBlock;

public class test {

    static int a = 23;
    static int b;
    static int max;
    // static blocks
    static {
        System.out.println("First Static block.");
        b = a * 5;
    }
    static {
        System.out.println("Second Static block.");
        max = 30;
    }

    // static method
    static void displaystatic() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);

    }
}