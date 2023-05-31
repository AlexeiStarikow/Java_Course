public class Chocolate extends Product {
    private double calories;
    private String type;


    public Chocolate(double calories, String type) {
        this.calories = calories;
        this.type = type;
    }

    public Chocolate(String inputName, double inputPrice, double calories, String type) {
        super(inputName, inputPrice);
        this.calories = calories;
        this.type = type;
    }

    public Chocolate(String brand, String name, double price, double calories, String type) {
        super(brand, name, price);
        this.calories = calories;
        this.type = type;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %s- %f : %f]", brand, name, type, price, calories);
    }

}
