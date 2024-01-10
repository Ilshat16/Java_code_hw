package HW3.task2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sasha", 1000);
        Employee emp2 = new Employee("Vasia", 2000);
        Employee lead = new Leader("Vova", 4000);

        Employee[] employees = {emp1, emp2, lead};
        int increment = 500;
        Leader.increaseSalary(employees, increment);
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
}
