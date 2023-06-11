
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        double salary = random.nextInt(20000, 80000);
        int age = random.nextInt(18,40);

        if (random.nextInt(2) == 0){
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age);
        }
        else
        {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age);
        }
        

    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        // Сортировка по умолчанию(Фамилия,ЗП)
        // Arrays.sort(employees);

        // Сортировка компаратором по Фамилии, Имени
        // Arrays.sort(employees, new SurnameNameComparator()); 

        // Сортировка по ЗП
        // Arrays.sort(employees, new SalaryComparator()); 

        // Сортировка по возрасту, ЗП
        Arrays.sort(employees, new AgeSalaryComparator()); 

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
