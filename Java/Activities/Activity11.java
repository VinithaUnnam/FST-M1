package activities;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	
	    public static void main(String[] args) {
	        Map<Integer, String> colours = new HashMap<>();
	        colours.put(1,"Red");
	        colours.put(2, "Blue");
	        colours.put(3, "Green");
	        colours.put(4, "Yellow");
	        colours.put(5, "Purple");
	        System.out.println(" Map: " + colours);
	        colours.remove(1); 
	        boolean containsRed = colours.containsValue("Red");
	        System.out.println("Does the Map contain 'Red'? " + containsRed);
	        System.out.println("Size of the Map: " + colours.size());
	        System.out.println("Updated Map: " + colours);
	    }
	}



