package DecoratorPattern;


public class Mushroom extends ToppingDecorator{

	BasePizza basePizza;
	public Mushroom(BasePizza basePizza) {
		this.basePizza=basePizza;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+15;
	}

}
