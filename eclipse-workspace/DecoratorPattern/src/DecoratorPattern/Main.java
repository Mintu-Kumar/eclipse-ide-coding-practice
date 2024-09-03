package DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ExtraChees ex = new ExtraChees(new Mushroom(new Margherita()));
		System.out.println(ex.cost());
	}

}
