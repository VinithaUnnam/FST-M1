package activities;

public class Activity6 {
public static void main (String[]args) throws InterruptedException {
	Plane plane = new Plane(10);
	plane.onboard("John");
    plane.onboard("Sarah");
    plane.onboard("Mike");
    System.out.println(plane.takeOff());
    System.out.println("Passengers onboard: " + plane.getPassengers());
    Thread.sleep(5000);
    plane.land();
    System.out.println("Plane landed at: " + plane.getLastTimeLanded());
}
}
