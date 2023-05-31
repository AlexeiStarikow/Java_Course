import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }


    public  Chocolate getChocolate(String type){

        for(Product product : products){
            if (product instanceof Chocolate){
               if ( ((Chocolate)product).getType()  == type){
                   return (Chocolate)product;
               }
            }
        }
        return null;
    }

    public  Cookies getCookies(String additin){

        for(Product product : products){
            if (product instanceof Cookies){
               if ( ((Cookies)product).getAdditin()  == additin){
                   return (Cookies)product;
               }
            }
        }
        return null;
    }

    public List<Product> getCalories(int maxCalories){
        List <Product> resCalories=new ArrayList<>();
        for (Product product : products) {
            if(product instanceof Cookies){
                if(((Cookies)product).getCalories() <= maxCalories){
                    resCalories.add(product);
                } 
            }
            else if(product instanceof Chocolate){
                if(((Chocolate)product).getCalories() <= maxCalories){
                    resCalories.add(product);
                }  
            }
            
        }
        return resCalories;
    }

    public List<Product> getPrice(int maxPrice){
        List <Product> resCalories=new ArrayList<>();
        for (Product product : products) {
            if(product instanceof Cookies){
                if(((Cookies)product).getPrice() <= maxPrice){
                    resCalories.add(product);
                } 
            }
            else if(product instanceof Chocolate){
                if(((Chocolate)product).getPrice() <= maxPrice){
                    resCalories.add(product);
                }  
            }
            
        }
        return resCalories;
    }

}
