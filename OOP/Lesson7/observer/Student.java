import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    
    public List <Vacancy> vacancies=new ArrayList<>();
    // Vacancy developer=new Vacancy("developer", minSalary);
    // Vacancy cleaner=new Vacancy("cleaner", minSalary);
    
    
    

    public Student(String name, double minSalary, List<Vacancy> vacancies) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
        this.vacancies = vacancies;
    }

   

    public Student(String string, List<Vacancy> vacancyForStudent) {
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, nameCompany, salary, vacancy);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
