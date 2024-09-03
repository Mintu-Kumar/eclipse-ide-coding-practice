package mainclasses;

import Strateg.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive()
	{
		driveStrategy.derive();
	}
	
	

}
