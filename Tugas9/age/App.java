package age;

public class App {
    // static variable
    static int age;
    // static method
    static void display() {
    System.out.println("Static Method");
    }
    public static void main(String[] args) {
    // access the static variable
    age = 30;
    System.out.println("Age is " + age);
    // access the static method
    display();
    }
   }