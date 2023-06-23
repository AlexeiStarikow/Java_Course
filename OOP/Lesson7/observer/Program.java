import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);


        // создаем вакансии
        Vacancy developer = new Vacancy("developer");
        Vacancy designer = new Vacancy("designer");
        Vacancy security = new Vacancy("security");
        Vacancy cleaner = new Vacancy("cleaner");

        List<Vacancy> vacancyForStudent=new ArrayList<>();
        vacancyForStudent.add(developer);
        vacancyForStudent.add(cleaner);
        vacancyForStudent.add(security);

        List<Vacancy> vacancyForJun=new ArrayList<>();
        vacancyForJun.add(developer);
        vacancyForJun.add(cleaner);

        List<Vacancy> vacancyForMaster=new ArrayList<>();
        vacancyForMaster.add(developer);
        vacancyForMaster.add(designer);
        
        List<Vacancy> vacancyForSenior=new ArrayList<>();
        vacancyForSenior.add(designer);
        vacancyForSenior.add(developer);


        Master ivanov = new Master("Ivanov",vacancyForMaster);
        Master petrov = new Master("Petrov",vacancyForMaster);
        Student sidorov = new Student("Sidorov", vacancyForStudent);
        Junior starikow=new Junior("Starikow",vacancyForJun);
        Senoir toropov= new Senoir("Toropov",vacancyForSenior);

        // добавляем нужные вакансии в компании
        geekBrains.vacancies.add(developer);
        geekBrains.vacancies.add(designer);

        google.vacancies.add(security);
        google.vacancies.add(cleaner);

        yandex.vacancies.add(developer);
        yandex.vacancies.add(designer);
        yandex.vacancies.add(security);


        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(starikow);
        jobAgency.registerObserver(toropov);

        for (int i = 0; i < 1; i++) {
            geekBrains.needEmployee(designer);
            google.needEmployee(cleaner);
            yandex.needEmployee(developer);
        }

    }

}
