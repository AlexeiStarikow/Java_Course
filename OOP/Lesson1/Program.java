import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.brand = "ООО Чистый Источник";
        product1.name = "Бутылка с водой";
        product1.price = 125.15;

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", 130, 1.5);

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", 150, 1.5, 10);


        Chocolate chocolate1=new Chocolate("Бабай", "нестл", 188, 400, "Молочный");
        Chocolate chocolate2=new Chocolate("Рош", "ферер", 80, 90, "Горький");
        Chocolate chocolate3=new Chocolate("Коркун", "шок", 230, 700, "Белый");

        Cookies cookies1=new Cookies("Тук", "Тук", 30, "С орехами", 90);
        Cookies cookies2=new Cookies("Так", "Так", 40, "Без сахара", 30);
        Cookies cookies3=new Cookies("Тык", "Тык", 80, "С шок", 100);


        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(cookies1);
        products.add(cookies2);
        products.add(cookies3);
        

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        Chocolate chocolateResult= vendingMachine.getChocolate("Горький");
        if(chocolateResult!=null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет)");
        }

        Cookies cookiesResult= vendingMachine.getCookies("Без сахара");
        if(chocolateResult!=null){
            System.out.println("Без сахара: ");
            System.out.println(cookiesResult.displayInfo());
        }
        else {
            System.out.println("Такого печенья нет)");
        }


        List<Product> calResult= vendingMachine.getCalories(150);
        
        if(calResult.size() > 0){
            System.out.println("Подходящие по калориям продукты: ");
            for (Product product : calResult) {
                System.out.println(product.toString());
            }
        }
        


        List<Product> priceResult=vendingMachine.getPrice(250);

        if(calResult.size() > 0){
            System.out.println("Подходящие по цене продукты: ");
            for (Product product : priceResult) {
                System.out.println(product.toString());
            }
        }
        
        
    }
}