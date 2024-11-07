package prak8;

public class Library {
  static {
      System.out.println("Library system initialized.");
  }

  public static String convertToUpperCase(String str) {
      return str.toUpperCase();
  }

  public static void main(String[] args) {
      // Example usage of the convertToUpperCase method
      String result = convertToUpperCase("hello");
      System.out.println(result);
  }
}

