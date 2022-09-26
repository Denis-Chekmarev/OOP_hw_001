public class Egg extends Food {
    
    int amountInProduct;

    public Egg(String title, double price, String unit, String useFull, int amountInProduct){
        super(title, price, unit, useFull);
        this.amountInProduct = amountInProduct;
    }

    @Override
    public String toString() {
        return String.format("%SКоличество в упаковке: %s\n", super.toString(), amountInProduct);
    }
}
