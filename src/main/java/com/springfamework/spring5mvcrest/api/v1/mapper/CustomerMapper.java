package com.springfamework.spring5mvcrest.api.v1.mapper;

import com.springfamework.spring5mvcrest.api.v1.model.CustomerDTO;
import com.springfamework.spring5mvcrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer custumer);
    Customer customerDTOToCustomer(CustomerDTO custumerDTO);
}
