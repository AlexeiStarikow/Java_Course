
public class Product {
    protected String name; // Наименование
    protected String brand; // Бренд
    protected double price; // Цена
    protected double calories; //Калории
   

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product() {
        this("product", 100);
    }

    public Product(String inputName, double inputPrice) {
        this("noname", inputName, inputPrice);
    }

    public Product(String brand, String name, double price) {
        if (brand == null || brand.length() < 3) {
            this.brand = "noname";
        } else {

            this.brand = brand;
        }
        if (name == null || name.length() < 3) {
            this.name = "product";
        } else {
            this.name = name;
        }
        checkPrice(price);
    }

    public Product(String name, String brand, double price, double calories) {
        if (brand == null || brand.length() < 3) {
            this.brand = "noname";
        } else {

            this.brand = brand;
        }
        if (name == null || name.length() < 3) {
            this.name = "product";
        } else {
            this.name = name;
        }
        checkPrice(price);
        if(calories<=0){
            this.calories = 10;
        }
        else{
            this.calories = calories;
        }
    }
    

    private void checkPrice(double price) {
        if (price <= 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %f- %f", brand, name, price, calories);
    }
  
}
