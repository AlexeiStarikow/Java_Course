package HomeWork;

import java.util.List;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    } 
    public List<Cat> foodForAll(List<Cat> catArray){
        for (Cat cat : catArray) {
            if(cat.getAppetite()<=food){
                food-=cat.getAppetite();
                cat.setSatiety(true);
            }
        }
        return catArray;
    }

    public void addFood(int addFood){
        food+=addFood;
    }
}
