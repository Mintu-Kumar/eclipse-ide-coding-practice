package DecoratorPattern;

public class ExtraChees extends ToppingDecorator {
   
	BasePizza basePizza;
	public ExtraChees(BasePizza basePizza) {
		this.basePizza=basePizza;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+10;
	}

}
