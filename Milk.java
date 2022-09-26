public class Milk extends Food {
    
    double fat;

    public Milk(String title, double price, String unit, String useFull, double fat){
        super(title, price, unit, useFull);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("%SУровень жирности: %s\n", super.toString(), fat);
    }
}
