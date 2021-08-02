package org.ms.services;

import org.ms.api.CustomerService;
import org.ms.api.exception.ApiException;
import org.ms.api.wrappers.ApiQueryRequest;
import org.ms.dao.CustomerDao;
import org.ms.dto.Customer;
import org.ms.dto.CustomerSearchFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getCustomers(ApiQueryRequest<CustomerSearchFilter> queryRequest) throws ApiException {
        return customerDao.getCustomers(queryRequest);
    }

    @Override
    public Boolean addCustomer(Customer customer) throws ApiException {
        Optional<Customer> existingCustomer = customerDao.getCustomerByEmailId(customer.getEmailId());
        if (!existingCustomer.isPresent()) {
            customerDao.addCustomer(customer);
        }
        return true;
    }

    @Override
    public Boolean updateCustomer(Customer customer) throws ApiException {
        Optional<Customer> existingCustomer = customerDao.getCustomerByEmailId(customer.getEmailId());
        if (existingCustomer.isPresent()) {
            // TODO  mapper code
            customerDao.updateCustomer(customer);
        } else {
            customerDao.addCustomer(customer);
        }
        return true;
    }

    @Override
    public Boolean deleteCustomer(String emailId) throws ApiException {
        Optional<Customer> existingCustomer = customerDao.getCustomerByEmailId(emailId);
        if (existingCustomer.isPresent()) {
            customerDao.deleteCustomer(emailId);
        }
        return true;
    }
}
