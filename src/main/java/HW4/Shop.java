package HW4;

import HW4.controllers.CustomerController;
import HW4.controllers.ItemController;
import HW4.controllers.OrderController;
import HW4.exceptions.CustomerNotFoundException;
import HW4.exceptions.IncorrectAmountException;
import HW4.exceptions.ItemNotFoundException;
import HW4.models.Customer;
import HW4.models.Gender;
import HW4.models.Item;
import HW4.services.CustomerService;
import HW4.services.ItemService;
import HW4.services.OrderService;
import HW4.view.CustomerView;
import HW4.view.ItemView;
import HW4.view.OrderView;
import java.util.Scanner;

public class Shop {
    private CustomerService customerService;
    private CustomerView customerView;
    private CustomerController customerController;
    private ItemService itemService;
    private ItemView itemView;
    private ItemController itemController;
    private OrderService orderService;
    private OrderView orderView;
    private OrderController orderController;
    private boolean work;
    private Scanner scanner;


    public Shop() {
        customerService = new CustomerService();
        customerView = new CustomerView();
        itemService = new ItemService();
        itemView = new ItemView();
        orderService = new OrderService();
        orderView = new OrderView();
        customerController = new CustomerController(customerService, customerView);
        itemController = new ItemController(itemService, itemView);
        orderController = new OrderController(orderService, orderView, customerController, itemController);
        work = true;
        scanner = new Scanner(System.in);

    }

    public void startShopping() {
        addData();
        while (work) {
            showMenu();
            execute();
        }
    }

    public void showMenu() {
        System.out.println("1. Сделать покупку");
        System.out.println("2. Закрыть программу");
    }

    private void execute() {
        int commandNum = getCommandNum();
        switch (commandNum) {
            case 1:
                placeOrder();
                break;
            case 2:
                finish();
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }

    private int getCommandNum() {
        System.out.print("Выбери номер команды: ");
        return scanner.nextInt();
    }

    private void finish() {
        work = false;
    }

    private void placeOrder() {
        try {
            orderController.createOrder();

        } catch (CustomerNotFoundException | IncorrectAmountException | ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addData() {
        customerService.add(new Customer("customer1", 20, 123, Gender.FEMALE));
        customerService.add(new Customer("customer2", 21, 345, Gender.MALE));
        itemService.add(new Item("item1", 10));
        itemService.add(new Item("item2", 20));
        itemService.add(new Item("item3", 30));
        itemService.add(new Item("item4", 40));
        itemService.add(new Item("item5", 50));
    }


}
