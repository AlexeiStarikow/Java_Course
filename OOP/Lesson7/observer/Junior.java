import java.util.List;
import java.util.Random;

public class Junior implements Observer {
    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Vacancy developer;


    public Junior(String name) {
        this.name = name;
        minSalary = random.nextDouble(30000, 70000);
    }

    public Junior(String string, List<Vacancy> vacancyForJun) {
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary){
            System.out.printf("Джун %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Джун %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
