package HW4.view;

import HW4.models.Order;

import java.util.Scanner;

public class OrderView {
    private Scanner scanner;

    public OrderView() {
        scanner = new Scanner(System.in);
    }

    public int getItemsQuantity() {
        System.out.println("Введите количество продуктов: ");
        return scanner.nextInt();
    }

    public void showOrder(Order order) {
        System.out.println(order.toString());
    }
}
