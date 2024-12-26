package activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("earth");
		myList.add("Mars");
		myList.add("jupiter");
		myList.add("saturn");
		myList.add("mercury");
		System.out.println("All names in the List:");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		String thirdName = myList.get(2);
		System.out.println("3rd name in the List is: " + thirdName);
		boolean containsThree = myList.contains("thirdName");
		System.out.println("is jupiter exists in list :" + myList.contains("jupiter"));
		System.out.println("The number of names in the ArrayList: " + myList.size());
		myList.remove("Mars");
		System.out.println("The number of names after removing 'Mars': " + myList.size());
	}
}
