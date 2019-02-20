package com.rusinek.bootstrap;

import com.rusinek.domain.Category;
import com.rusinek.domain.Customer;
import com.rusinek.repositories.CategoryRepository;
import com.rusinek.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;


    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategoryData();
        loadCustomerData();

    }

    private void loadCategoryData() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        loadCustomerData();


        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        System.out.println("Data Loaded = " + categoryRepository.count() );
    }

    private void loadCustomerData() {
        Customer adrian = new Customer();
        adrian.setFirstName("Adrian");
        adrian.setLastName("Rusinek");

        Customer bogdan = new Customer();
        bogdan.setFirstName("Bogdan");
        bogdan.setLastName("Somth");


        customerRepository.save(adrian);
        customerRepository.save(bogdan);
    }
}
