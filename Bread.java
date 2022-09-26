public class Bread extends Food {
    
    /** Тип муки */
    String typeFlour;

    public Bread(String title, double price, String unit, String useFull, String typeFlour){
        super(title, price, unit, useFull);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return String.format("%SТип муки: %S\n", super.toString(), typeFlour);
    }
}
