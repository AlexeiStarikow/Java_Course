import java.util.Scanner;

public class OrderInit{

    private static  Scanner scanner = new Scanner(System.in);

    public static void inputFromConsole(Order order){
        // String clientName = prompt("Имя клиента: ");
        // int qnt = Integer.parseInt(prompt("Кол-во: "));
        // int price = Integer.parseInt(prompt("Цена: "));

        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Имя клиента: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
       
    }

    private static String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
