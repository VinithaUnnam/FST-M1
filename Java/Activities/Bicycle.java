package activities;

public class Bicycle implements BicycleParts, BicycleOperations {
    int gears;      
    int currentSpeed; 

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;  
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;  
    }

    public String bicycleDesc() {
        return "Number of gears: " + gears + "\nMax speed: " + maxSpeed;
    }
}
