public class Drink extends Product {

    protected double volume;

    public Drink(String title, double price, String unit, double volume){
        super(title, price, 1000, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%SОбъем: %s\n", super.toString(), volume);
    }
}
