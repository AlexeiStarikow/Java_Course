import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Double.compare(o1.age,o2.age);
        if (res == 0)
            return Double.compare(o1.calculateSalary(),o2.calculateSalary());
        else
            return res;
    }

}
