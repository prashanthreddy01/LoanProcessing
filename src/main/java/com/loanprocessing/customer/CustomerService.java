package com.loanprocessing.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanprocessing.customerRepository.CustomerRepository;
import com.loanprocessing.entity.Customer;

@Service
public class CustomerService {

	 @Autowired
    private  CustomerRepository customerRepository;

 
    public Customer createCustomer(Customer customer) {
        // Add any validation logic here before saving the customer
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(int customerId) {
        return customerRepository.findById((int) customerId).orElse(null);
    }

    public long  deleteCustomerById(int customerId) {
       
		  customerRepository.findById(customerId);
		return customerId;
		  
    }

    public Customer updateCustomer(int customerId, Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById((int) customerId).orElse(null);
        if (existingCustomer != null) {
            // Update only the fields that are allowed to be updated
            existingCustomer.setCustName(updatedCustomer.getCustName());
            existingCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
            existingCustomer.setSalary(updatedCustomer.getSalary());
            existingCustomer.setAdhaar(updatedCustomer.getAdhaar());
            existingCustomer.setDateOfApplication(updatedCustomer.getDateOfApplication());
            
            return customerRepository.save(existingCustomer);
        }
        return null;
    }
}
