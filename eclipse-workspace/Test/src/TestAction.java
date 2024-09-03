
public class TestAction {
    
	String message;
	String firstName;
	public String execute() {
		System.out.println("Hello");
		message = "SUCCESS Message";
		System.out.println("First name :"+ firstName);
		return "success";
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}

