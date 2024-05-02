package edu.clothify.service;

import edu.clothify.dto.CustomerDto;
import edu.clothify.entity.Customer;

public interface CustomerService {
    public boolean addCustomer(CustomerDto customerDto);

    CustomerDto getCustomerByName(String name);

    Customer updateCustomer(Long id, CustomerDto customerDto);
}
