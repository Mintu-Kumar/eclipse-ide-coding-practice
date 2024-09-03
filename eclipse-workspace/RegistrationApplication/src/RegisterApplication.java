import com.opensymphony.xwork2.ActionSupport;

public class RegisterApplication extends ActionSupport{
	
	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	
	public String execute() {
		System.out.println("Hello");
		return "success";
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setAge(Integer age) {
		this.age = age;
		
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public void validate() {
		
		if(firstName.equals("")) {
			addFieldError("firstName"," First name is required");
		}
		if(lastName.equals("")) {
			addFieldError("lastName"," Last name is required");
		}
		if(gender== null) {
			addFieldError("gender","Gender is required");
		}
		if(age== null) {
			addFieldError("age","Age is required");
		}
		else if(age <= 18) {
			addFieldError("age","Age should be above 18");
		}
	}
	
}