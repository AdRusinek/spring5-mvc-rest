package com.rusinek.controllers.v1;

import com.rusinek.api.v1.model.CustomerDTO;
import com.rusinek.api.v1.model.CustomerListDTO;
import com.rusinek.domain.Customer;
import com.rusinek.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getAllCustomers() {
        return new ResponseEntity<CustomerListDTO>(
                new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerDTO> getCustomerData(@PathVariable Long id) {
        return new ResponseEntity<CustomerDTO>(
                customerService.getCustomerById(id), HttpStatus.OK);
    }

}
