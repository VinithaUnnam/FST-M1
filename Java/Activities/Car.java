package activities;


public class Car {
	String color;      // global variables
    String transmission;
    int make;
    int tyres;
    int doors;
   
    
   public Car(String color,String transmission,int make,int tyres,int doors){
    	this.tyres=tyres;//
    	this.doors=doors;
    	this.color=color;
    	this.transmission=transmission;
    	this.make=make;
   }
    	
    	public void displayCharacteristics() {
    		int i=0;
            System.out.println("Color: " + color);
            System.out.println("Transmission: " + transmission);
            System.out.println("Make: " + make);
            System.out.println("Tyres: " + tyres);
            System.out.println("Doors: " + doors);
    	
    	}
    	public void accelarate() {
    		System.out.println("Car is moving forward");
    	}
    	public void brake() {
    		System.out.println("Car has stopped");
    	}
    	
}

