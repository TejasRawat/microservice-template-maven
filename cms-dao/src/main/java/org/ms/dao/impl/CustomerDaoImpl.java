package org.ms.dao.impl;

import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dao.CustomerDao;
import org.ms.dto.Customer;
import org.ms.dto.CustomerSearchFilter;
import org.ms.entitiy.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CustomerDaoImpl implements CustomerDao {

    private Map<String, CustomerEntity> customerMap = new ConcurrentHashMap<>();

    @Override

    public List<Customer> getCustomers(ApiQueryRequest<CustomerSearchFilter> queryRequest) throws ApiException {

        return null;
    }

    @Override
    public Boolean addCustomer(Customer customer) throws ApiException {

        return null;
    }

    @Override
    public Boolean updateCustomer(Customer customer) throws ApiException {

        return null;
    }

    @Override
    public Boolean deleteCustomer(String emailId) throws ApiException {

        return null;
    }

    @Override
    public Optional<Customer> getCustomerByEmailId(String emailId) throws ApiException {
        return Optional.empty();
    }
}
