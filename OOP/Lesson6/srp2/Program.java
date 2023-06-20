public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        OrderInit.inputFromConsole(order);

        OrderSaver.saveToExel(order);
        OrderSaver.saveToXml(order);
        OrderSaver.saveToJson(order);

        

    }

}
