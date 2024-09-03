package constructor_injection;

public class address {
	
	private String city;
	private String state;
	private String country;
	
	public address(String city, String state, String country) {
		this.city = city;
		this.city = state;
		this.country = country;
		
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	

}
