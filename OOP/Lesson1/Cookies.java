public class Cookies extends Product {
    private String additin;
    private double calories;

    public Cookies(String additid, double calories) {
        this.additin = additid;
        this.calories = calories;
    }

    public Cookies(String inputName, double inputPrice, String additid, double calories) {
        super(inputName, inputPrice);
        this.additin = additid;
        this.calories = calories;
    }

    public Cookies(String brand, String name, double price, String additid, double calories) {
        super(brand, name, price);
        this.additin = additid;
        this.calories = calories;
    }

    public String getAdditin() {
        return additin;
    }

    public void setAdditin(String additid) {
        this.additin = additid;
    }

    public double getCalories() {
        return calories;
    }
    
    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %s- %f : %f]", brand, name, additin, price, calories);
    }

}
