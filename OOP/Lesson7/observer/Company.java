import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company{
    
    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;
    
    private Publisher jobAgency;

    public List<Vacancy> vacancies=new ArrayList<>();

    
    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, salary, vacancy );
    }
}
  
  