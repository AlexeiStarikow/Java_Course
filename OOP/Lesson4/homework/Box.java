
import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruitList;
    float totalWeight;
    int count;


    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public ArrayList<F> getFruits() {
        return fruitList;
    }

    public void addFruit(F fruit) {
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
        count++;
    }


    public float getBoxWeight() {
        float res=0.0f;
        for (F f : fruitList) {
            res+= f.getWeight();
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("Количество в коробке: %d . Общий вес: %f", count, totalWeight);
    }

    // public boolean compare(Box<?> box) {
    //     return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    // }

    public boolean compare(Box<?> box) {
        return Double.compare(this.getBoxWeight(), box.getBoxWeight()) == 0;
    }

    public void pour(Box<F> anotherBox) {
        for (F fruit : fruitList) {
            anotherBox.addFruit(fruit);
        }
        fruitList.clear();
        totalWeight=0;
        count=0;
    }

}
