
/**
 * Предметы гигиены
 */
public class HygieneItems extends Product {
    
    /**
     * Количество штук в упаковке 
     */
    protected int amountInProduct;

    public HygieneItems(String title, double price, String unit, int amountInProduct){
        super(title, price, unit);
        this.amountInProduct = amountInProduct;
    }

    @Override
    public String toString() {
        return String.format("%SКоличество в упаковке: %S\n", super.toString(), amountInProduct);
    }
}
