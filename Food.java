/**
 * Food
 * Продукты, содержащие срок годности
 */
public class Food extends Product {

    protected String useFull;

    public Food(String title, double price, String unit, String useFull){
        super(title, price, unit);
        this.useFull = useFull;
    }

    @Override
    public String toString() {
        return String.format("%SСрок годности: %S\n", super.toString(), useFull);
    }
}