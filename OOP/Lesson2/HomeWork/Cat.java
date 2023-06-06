package HomeWork;

public class Cat {
    private String name;
    public int appetite;
    public boolean satiety;
    
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public Plate eat(Plate plate){
        if(plate.getFood()>= getAppetite()){
            plate.setFood(plate.getFood() - getAppetite());
            satiety=true;
        }
        else{
            System.out.println("Коту не хватит. ");
        }
        return plate;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    @Override
    public String toString() {
        return String.format("Имя: %s, Аппетит: %d, Сытость: %b\n", name, appetite, satiety);
    }
}
