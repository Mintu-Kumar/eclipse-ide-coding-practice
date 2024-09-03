package NullDesignPattern;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle =  VehicleFactory.getVehicleObject("CAR");
		printVehicleDetails(vehicle);
	}
	
	private static void printVehicleDetails(Vehicle vehicle)
	{
	  System.out.println("Tank Capacity="+ vehicle.getTankCapacity());
	  System.out.println("Seat Capacity="+ vehicle.getSeatCapacity());
	}

}
