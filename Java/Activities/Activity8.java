package activities;


public class Activity8 {
 public static void exceptionTest(String input) throws CustomException {
     if (input == null) {
         throw new CustomException("Input string cannot be null!");
     } else {
         System.out.println("The string is: " + input);
     }
 }

 public static void main(String[] args) {
     try {
         exceptionTest("Hello, World!");
                  exceptionTest(null);
     } catch (CustomException e) {
         System.out.println("CustomException caught: " + e.getMessage());
     }
 }
}

