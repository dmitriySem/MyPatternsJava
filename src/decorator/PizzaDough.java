package decorator;

public class PizzaDough implements Pizza{
    @Override
    public String getDescription() {
        return "Тесто для пиццы";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
