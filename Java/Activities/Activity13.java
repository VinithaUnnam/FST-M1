package activities;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Activity13 {
	    public static void main(String[] args) {
	        // Create a Scanner object to accept input from the user
	        Scanner scan = new Scanner(System.in);

	        // Create an ArrayList to store the numbers
	        ArrayList<Integer> list = new ArrayList<>();

	        // Create a Random object to generate random index
	        Random indexGen = new Random();

	        // Prompt the user to enter numbers
	        System.out.println("EOF or non-integer to terminate):");

	        // Accept integer values from the user and store them in the ArrayList
	        while(scan.hasNextInt()) {
	            list.add(scan.nextInt());
	        }

	        // Convert the ArrayList to an array
	        Integer[] nums = list.toArray(new Integer[0]);

	        // Ensure that the array is not empty
	        if (nums.length > 0) {
	            // Generate a random index between 0 and nums.length - 1
	            int randomIndex = indexGen.nextInt(nums.length);

	            // Print the random index and the value at that index in the array
	            System.out.println("Generated Index: " + randomIndex);
	            System.out.println("Value at index " + randomIndex + ": " + nums[randomIndex]);
	        } else {
	            System.out.println("No numbers were entered.");
	        }

	        // Close the scanner
	        scan.close();
	    }
	}


