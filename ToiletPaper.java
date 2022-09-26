public class ToiletPaper extends HygieneItems {
    
    /**
     * Количество слоев
     */
    int layerAmount;


    public ToiletPaper(String title, double price, String unit, int amountInProduct, int layerAmount){
        super(title, price, unit, amountInProduct);
        this.layerAmount = layerAmount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
