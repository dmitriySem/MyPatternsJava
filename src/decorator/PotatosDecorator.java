package decorator;

public class PotatosDecorator extends PizzaDecorator{

        public PotatosDecorator(Pizza pizza) {
            super(pizza);
        }

        @Override
        public String getDescription() {
            return pizza.getDescription() + ", потатос";
        }

        @Override
        public int getCost() {
            return pizza.getCost() + 45;
        }
}

