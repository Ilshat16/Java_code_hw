package HW4.view;

import HW4.models.Item;

import java.util.Scanner;

public class ItemView {
    private final Scanner scanner;

    public ItemView() {
        scanner = new Scanner(System.in);
    }
    public Item createItem() {
        System.out.println("Введите название продукта: ");
        String name = scanner.nextLine();
        System.out.println("Введите цену продукта: ");
        int price = scanner.nextInt();
        return new Item(name, price);
    }
    public String getItemName() {
        System.out.println("Введите название продукта: ");
        return scanner.nextLine();
    }

    public void showItem(Item item) {
        System.out.println(item.toString());
    }
}
