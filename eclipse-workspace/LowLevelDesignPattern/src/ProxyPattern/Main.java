package ProxyPattern;

public class Main {

	public static void main(String[] args) {
		
		try {
			EmployeeDao dao =  new EmployeeDaoProxy();
			dao.create("ADMIN", new EmployeeDo());
			System.out.println("Operation Successfull");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
