package builder;

public abstract class PizzaBuilder {

	protected Pizza pizza = new Pizza();

	public abstract void buildName();

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildPrepare();

	public abstract void buildBake();

	public abstract void buildCut();

	public abstract void buildBox();
	
	public abstract void buidToppings();
	
	public Pizza getPizza() {
		return pizza;
	};
}
