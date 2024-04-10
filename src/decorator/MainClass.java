package decorator;

public class MainClass {
    public static void print(Pizza pizza){
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }

    public static void main(String[] args) {
        Pizza pizza = new PotatosDecorator(new CheesDecorator(new PizzaDough()));

        print(pizza);

    }
}
