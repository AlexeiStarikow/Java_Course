
/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary,int age) {
        super(name, surname, salary,age);
    }

    
     @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Заработная плата за 160 часов: %.2f (руб.), Возраст: %d",
                surname, name, calculateSalary(), age);
    }


    @Override
    public double calculateSalary() {
        return salary;
    }
}
