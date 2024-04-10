package decorator;

public class CheesDecorator extends PizzaDecorator{

    public CheesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", сыр";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
