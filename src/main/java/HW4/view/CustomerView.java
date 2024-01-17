package HW4.view;

import HW4.models.Customer;
import HW4.models.Gender;

import java.util.Scanner;

public class CustomerView {
    private Scanner scanner;

    public CustomerView() {
        scanner = new Scanner(System.in);
    }

    public Customer createCustomer() {
        System.out.println("Введите имя покупателя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст покупателя: ");
        int age = scanner.nextInt();
        System.out.println("Введите номер телефона покупателя");
        int phone = scanner.nextInt();
        System.out.println("Введите пол покупателя: ");
        String gender = scanner.nextLine();
        return new Customer(name, age, phone, Gender.valueOf(gender.toUpperCase()));
    }
    public String getCustomerName() {
        System.out.print("Введите имя покупателя: ");
        return scanner.nextLine();
    }

    public void showCustomer(Customer customer) {
        System.out.println(customer.toString());
    }

}
