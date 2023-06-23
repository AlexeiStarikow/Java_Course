import java.util.List;
import java.util.Random;

public class Senoir implements Observer{
    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Vacancy developer;
    public Vacancy designer;

    public Senoir(String name) {
        this.name = name;
        minSalary = random.nextDouble(150000, 300000);
    }

    public Senoir(String string, List<Vacancy> vacancyForSenior) {
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary){
            System.out.printf("Senior %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Senior %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
