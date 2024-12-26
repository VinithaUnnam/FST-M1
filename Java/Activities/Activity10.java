package activities;
import java.util.HashSet;
public class Activity10 {
	 public static void main(String[] args) {
	        HashSet<String> hs = new HashSet<>();
	        hs.add("earth");
	        hs.add("mars");
	        hs.add("jupiter");
	        hs.add("venus");
	        hs.add("saturn");
	        hs.add("pluto");
	        System.out.println("Size of HashSet: " + hs.size());
	        hs.remove("pluto");
	        if(hs.remove("abc")) {
	        		System.out.println("abc removed from the Set");
	        } else {
	        	System.out.println("abc is not present in the Set");
	        }
	        boolean containsItem = hs.contains("jupiter");
	        System.out.println("Does HashSet contain 'jupiter'? " + containsItem);
	        System.out.println("Updated HashSet: " + hs);
	    }
	}


