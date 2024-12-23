package activities;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
    private int maxPassengers;  
    private ArrayList<String> passengers; 
    private Date lastTimeLanded;  

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot onboard more passengers. Maximum capacity reached.");
        }
    }

    public String takeOff() {
        return "Take-off time: " + new Date();
    }

    public void land() {
        lastTimeLanded = new Date();  
        passengers.clear();  
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}
