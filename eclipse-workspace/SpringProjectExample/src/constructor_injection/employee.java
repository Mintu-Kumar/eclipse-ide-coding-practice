package constructor_injection;

public class employee {
	
	private int id;
	private double salary;
	private address Address;
	
	public employee() {
    }
	
	public employee(int id, double salary, address Address) {
		super();
		this.id =id;
		this.salary = salary;
		this.Address = Address;
		
		
	}
	
	void show() {
		System.out.println(id+ " "+salary);
		System.out.println(Address.toString());
	}

}
