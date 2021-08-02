package org.ms.api;

import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dto.Customer;
import org.ms.dto.CustomerSearchFilter;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers(ApiQueryRequest<CustomerSearchFilter> queryRequest) throws ApiException;

    Boolean addCustomer(Customer customer) throws ApiException;

    Boolean updateCustomer(Customer customer) throws ApiException;

    Boolean deleteCustomer(String loginId) throws ApiException;

}
