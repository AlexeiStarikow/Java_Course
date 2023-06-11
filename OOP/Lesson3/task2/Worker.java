
public class Worker extends Employee {

    public Worker(String name, String surname, double salary,int age) {
        super(name, surname, salary,age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата : %.2f (руб.), Возраст: %d",
                surname, name, calculateSalary(), age);
    }
}
