package com.rusinek.api.v1.mapper;

import com.rusinek.api.v1.model.CustomerDTO;
import com.rusinek.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "id", target = "id")
    CustomerDTO customerToCustomerDTO(Customer customer);
}
