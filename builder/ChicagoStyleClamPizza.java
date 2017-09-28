package builder;

public class ChicagoStyleClamPizza extends PizzaBuilder {

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void buildName() {
		pizza.name = "Chicago Style Clam Pizza";

	}

	@Override
	public void buildDough() {
		pizza.dough = "Extra Thick Crust Dough";

	}

	@Override
	public void buildSauce() {
		pizza.sauce = "Plum Tomato Sauce";

	}

	@Override
	public void buildPrepare() {
		pizza.prepare();

	}

	@Override
	public void buildBake() {
		pizza.bake();

	}

	@Override
	public void buildCut() {
		pizza.cut();

	}

	@Override
	public void buildBox() {
		pizza.box();

	}

	@Override
	public void buidToppings() {
		pizza.toppings.add("Shredded Mozzarella Cheese");
		pizza.toppings.add("Frozen Clams from Chesapeake Bay");

	}
}