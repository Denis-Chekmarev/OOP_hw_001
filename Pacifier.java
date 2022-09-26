public class Pacifier extends KidsProduct {
    

    public Pacifier(String title, double price, String unit, int minAge, boolean hypoallergenic){
        super(title, price, unit, minAge, hypoallergenic);
    }

    public Pacifier(String title, double price, String unit, int minAge){
        super(title, price, unit, minAge);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
