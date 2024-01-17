package HW4.services;

import HW4.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customers;

    public CustomerService () {
        customers = new ArrayList<>();
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void addAll(List<Customer> customers) {
        customers.addAll(customers);
    }

    public Customer findByName(String name) {
        for(Customer customer : customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        return null;
    }
}
