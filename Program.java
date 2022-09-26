import java.util.ArrayList;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Продукт #1"));
        list.add(new Drink("Coca-cola", 110, "шт", 1));
        list.add(new Food("Яблоко", 50, "кг", "10.10.2022"));
        list.add(new HygieneItems("Шампунь", 354, "шт", 1));
        list.add(new KidsProduct("Пюре", 24, "шт", 0));
        

        for (Product product : list) {
            System.out.printf("--------------\n");
            System.out.println(product);
            System.out.printf("--------------\n");
        }
    }
}