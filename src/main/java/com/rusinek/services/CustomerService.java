package com.rusinek.services;

import com.rusinek.api.v1.model.CustomerDTO;
import com.rusinek.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

}
