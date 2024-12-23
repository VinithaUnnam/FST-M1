package activities;

public class Activity7 {

    public static void main(String[] args) {
    	int gears=3;int currentspeed=0;int seatHeight=25;
        MountainBike mb = new MountainBike(gears,currentspeed,seatHeight);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
        System.out.println("Current speed: " + mb.currentSpeed);
    }
}
