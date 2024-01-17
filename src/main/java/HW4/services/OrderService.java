package HW4.services;

import HW4.models.Customer;
import HW4.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService { ;
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order) {
        orders.add(order);
    }

    public Order getOrder(Customer customer) {
        for(Order order : orders) {
            if(order.getCustomer().equals(customer))
                return order;
        }
        return null;
    }

    public List<Order> getOrders() {
        return orders;
    }

}
