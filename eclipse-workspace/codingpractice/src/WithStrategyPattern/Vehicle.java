package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
public class Vehicle {

	DriveStrategy driveObeject;
	
	Vehicle(DriveStrategy driveObj) {
		this.driveObeject = driveObj;
	}
	
	public void drive() {
		System.out.println("2");
		driveObeject.drive();
		System.out.println("3");
	}
}
