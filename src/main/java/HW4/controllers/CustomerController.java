package HW4.controllers;

import HW4.exceptions.CustomerNotFoundException;
import HW4.models.Congrats;
import HW4.models.Customer;
import HW4.services.CustomerService;
import HW4.view.CustomerView;

public class CustomerController {
    private CustomerService customerService;
    private CustomerView customerView;
    private Congrats congrats;

    public CustomerController(CustomerService customerService, CustomerView customerView) {
        this.customerService = customerService;
        this.customerView = customerView;
        congrats = new Congrats();
    }

    public void createCustomer() {
        Customer customer = customerView.createCustomer();
        congrats.congratulation(customer.getGender());
        customerService.add(customer);
    }

    public Customer findByName() throws CustomerNotFoundException {
        String name = customerView.getCustomerName();
        Customer customer = customerService.findByName(name);
        if(customer == null)
            throw new CustomerNotFoundException("Такого покупателя нет в списке");
        else {
            congrats.congratulation(customer.getGender());
            return customer;
        }
    }
}
