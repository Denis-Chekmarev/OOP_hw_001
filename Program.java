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

        list.add(new Bread("Хлеб", 35, "шт", "10.10.2022", "Отруби"));
        list.add(new Diapers("Памперсы J&B", 500, "шт", 0));
        list.add(new Egg("Яйцо куринное", 70, "шт", "10.10.2022", 10));
        list.add(new Limonad("Лимонад", 55, "л", 1));
        list.add(new Mask("Маска для лица", 150, "шт", 10));
        list.add(new Milk("Молоко", 70, "л", "10.10.2022", 3.4));
        list.add(new Pacifier("Соска детская", 60, "шт", 0));
        list.add(new ToiletPaper("Бумага туалетная", 200, "шт", 4, 2));
        

        for (Product product : list) {
            System.out.printf("--------------\n");
            System.out.println(product);
            System.out.printf("--------------\n");
        }
    }
}