package com.loanprocessing.customer;

import java.util.List;

import com.loanprocessing.entity.Customer;
import com.loanprocessing.customerException.ResourceNotFoundException;

public interface ICustomerService {
	  Customer viewCustomer(int custid) throws ResourceNotFoundException;

	    List<Customer> viewAllCustomers() throws ResourceNotFoundException;

//	    Customer addCustomer(CustomerDto customer) throws CouldNotBeAddedException;
//
//	    Customer updateCustomer(int id, DocsDto docsDto) throws ResourceNotFoundException;

	    Customer deleteCustomerById(int custId) throws ResourceNotFoundException;

	    List<Customer> viewCustomerList(String dateOfApplication) throws ResourceNotFoundException;

	}

