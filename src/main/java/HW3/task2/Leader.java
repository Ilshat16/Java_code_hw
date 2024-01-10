package HW3.task2;

public class Leader extends Employee{
    public Leader(String name, double salary) {
        super(name, salary);
    }

    public static void increaseSalary(Employee[] employees, double increment) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof Leader)
                continue;
            else
                employees[i].setSalary(employees[i].getSalary() + increment);
        }
    }
}
