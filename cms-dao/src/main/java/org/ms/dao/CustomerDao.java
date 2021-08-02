package org.ms.dao;

import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dto.Customer;
import org.ms.dto.CustomerSearchFilter;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    List<Customer> getCustomers(ApiQueryRequest<CustomerSearchFilter> queryRequest) throws ApiException;

    Boolean addCustomer(Customer customer) throws ApiException;

    Boolean updateCustomer(Customer customer) throws ApiException;

    Boolean deleteCustomer(String emailId) throws ApiException;

    Optional<Customer> getCustomerByEmailId(String emailId) throws ApiException;


}
