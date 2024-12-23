package activities;

public class MountainBike extends Bicycle {
    int seatHeight;  

    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);  
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
    	String bikeDesc = super.bicycleDesc();  
    	bikeDesc = bikeDesc + "\nSeat height is: " + seatHeight;  
    	return bikeDesc;  
}
}
