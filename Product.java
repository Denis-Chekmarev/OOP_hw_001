
/**
 * Класс товар
 * Наименование
 * Цена
 * Количество
 * Единица измерения
 */
public class Product {
    
    protected String title;
    protected double price;
    protected int amount;
    protected String unit;

    public Product(String title, double price, int amount, String unit){
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public Product(String title, double price, String unit){
        this(title, price, 150, unit);
    }

    public Product(String title, double price){
        this(title, price, 150, "шт");
    }

    public Product(String title){
        this(title, 100, 1000, "шт");
    }



    @Override
    public String toString() {
        return String.format("Название: %S\nЦена: %s\nКоличество: %s\nЕдиница Измерения: %S\n", title, price, amount, unit);
    }
}
