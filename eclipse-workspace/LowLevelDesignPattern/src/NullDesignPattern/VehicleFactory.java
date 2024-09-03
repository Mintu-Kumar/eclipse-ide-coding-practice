package NullDesignPattern;

public class VehicleFactory {
	
	public static Vehicle getVehicleObject(String vehicle)
	{
		if(vehicle.equals("CAR"))
		{
			return new Car();
		}
		return new NullVehicle();
	}

}
