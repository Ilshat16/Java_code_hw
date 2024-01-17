package HW4.controllers;

import HW4.exceptions.CustomerNotFoundException;
import HW4.exceptions.IncorrectAmountException;
import HW4.exceptions.ItemNotFoundException;
import HW4.models.Customer;
import HW4.models.Item;
import HW4.models.Order;
import HW4.services.OrderService;
import HW4.view.OrderView;

public class OrderController {
    private OrderService orderService;
    private OrderView orderView;

    private CustomerController customerController;
    private ItemController itemController;

    public OrderController(OrderService orderService, OrderView orderView, CustomerController customerController, ItemController itemController) {
        this.orderService = orderService;
        this.orderView = orderView;
        this.customerController = customerController;
        this.itemController = itemController;
    }

    public void createOrder() throws CustomerNotFoundException, ItemNotFoundException, IncorrectAmountException {
        Customer customer = customerController.findByName();
        Item item = itemController.findByName();
        int itemsQuantity = orderView.getItemsQuantity();
        if(itemsQuantity < 0)
            throw new IncorrectAmountException("Некорректное количество продуктов");
        else
            orderService.add(new Order(customer, item, itemsQuantity));
    }

    public void showOrder() throws CustomerNotFoundException {
        Customer customer = customerController.findByName();
        Order order = orderService.getOrder(customer);
        orderView.showOrder(order);
    }
}
