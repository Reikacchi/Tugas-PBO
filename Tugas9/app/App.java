package app;

public class App {
    public static void main( String[] args ) {
    // create an instance of the StaticTest class
    StaticTest st = new StaticTest();
    // call the nonstatic method
    System.out.println(" 2 * 2 = " + st.multiply(2,2));
    // call the static method
    System.out.println(" 2 + 3 = " + StaticTest.add(2,3));
    }
   }
   