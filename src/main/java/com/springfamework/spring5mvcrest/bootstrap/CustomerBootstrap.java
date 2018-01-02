package com.springfamework.spring5mvcrest.bootstrap;

import com.springfamework.spring5mvcrest.domain.Customer;
import com.springfamework.spring5mvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerBootstrap implements CommandLineRunner {

    private CustomerRepository customerRepository;

    public CustomerBootstrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) {
        Customer joe = new Customer();
        joe.setFirstName("Joe");
        joe.setLastName("Newman");

        Customer michael = new Customer();
        michael.setFirstName("Michael");
        michael.setLastName("Lachappele");

        customerRepository.save(joe);
        customerRepository.save(michael);

        System.out.println("Customers loaded = " + customerRepository.count());
    }
}
