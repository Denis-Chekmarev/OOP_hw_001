public class Diapers extends KidsProduct {
    
    int size;
    int minWeight;
    int maxWeight;
    String type;


    public Diapers(String title, double price, String unit, int minAge, int size, int minWeight, int maxWeight, String type){
        super(title, price, unit, minAge);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String title, double price, String unit, int minAge){
        super(title, price, unit, minAge);
        this.size = 15;
        this.minWeight = 2;
        this.maxWeight = 30;
        this.type = "для младенцев";
    }

    @Override
    public String toString() {
        return String.format("%SРазмер: %s\nМинимальный вес: %s\nМаксимальный вес: %s\nТип: %s", super.toString(), size, minWeight, maxWeight, type);
    }
}
