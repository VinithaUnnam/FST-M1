package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class Activity1 {
    // Declare a list of strings that we will use in our tests
    static ArrayList<String> list;

    // This method will be run before each test to set up the initial state
    @BeforeEach
    void setUp() {
        // Initialize the list
        list = new ArrayList<String>();

        // Add two elements to the list
        list.add("alpha"); // The first item is "alpha"
        list.add("beta");  // The second item is "beta"
    }

    // This test method checks if we can insert an element into the list
    @Test
    public void insertTest() {
        // Assert that the list currently has 2 elements
        assertEquals(2, list.size(), "The list should have 2 elements initially");

        // Add a new element at index 2 (third position)
        list.add(2, "charlie");  // The new element is "charlie"

        // Assert that the size of the list is now 3 (after adding "charlie")
        assertEquals(3, list.size(), "The list should have 3 elements after insertion");

        // Assert that the first element is still "alpha"
        assertEquals("alpha", list.get(0), "The first element should be 'alpha'");

        // Assert that the second element is still "beta"
        assertEquals("beta", list.get(1), "The second element should be 'beta'");

        // Assert that the third element is "charlie"
        assertEquals("charlie", list.get(2), "The third element should be 'charlie'");

        // Print a message to the console when the test passes
        System.out.println("Test passed: insertTest()");
    }
}
