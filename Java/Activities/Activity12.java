package activities;

public class Activity12 {
	public static void main(String[] args) {
        // Step 2: Lambda expression without a body (ad1)
        Addable ad1 = (a, b) -> (a + b); 

        // Step 3: Lambda expression with a body (ad2)
        Addable ad2 = (int a, int b) -> {
            return (a + b); 
        };

        int result1 = ad1.add(5,10); // Using ad1 to add 5 and 10
        int result2 = ad2.add(15, 20); // Using ad2 to add 15 and 20
        System.out.println("Result of ad1 (5 + 10): " + result1);
        System.out.println("Result of ad2 (15 + 20): " + result2);
    }
}

