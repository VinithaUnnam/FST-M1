package activities;

public class Activity1 {
    public static void main(String[] args) {
        String color="red";String transmission="xys";int make=2014,tyres=4,doors=4;
        Car toyota = new Car(color,transmission,make,tyres,doors); // Corrected class name
        toyota.displayCharacteristics();
        toyota.accelarate();
        toyota.brake();
       
    }
  
}

