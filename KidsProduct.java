/**
 * KidsProduct
 */
public class KidsProduct extends Product {

    int minAge;
    Boolean hypoallergenic;


    public KidsProduct(String title, double price, String unit, int minAge, boolean hypoallergenic){
        super(title, price, unit);
        this.minAge = minAge;
    }

    public KidsProduct(String title, double price, String unit, int minAge){
        super(title, price, unit);
        this.minAge = minAge;
        this.hypoallergenic = false;
    }

    @Override
    public String toString() {
        return String.format("%SМинимальный возраст: %s\nГиппоаллергенность: %b\n", super.toString(), minAge, hypoallergenic);
    }
}