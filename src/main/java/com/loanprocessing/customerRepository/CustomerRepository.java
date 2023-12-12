package com.loanprocessing.customerRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loanprocessing.entity.Customer;

@EnableJpaRepositories
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	    List<Customer> findByDateOfApplication(LocalDate dateOfApplication);

	    Customer findByPhoneNumber(String phoneNumber);

		Optional<Customer> findById(int customerId);

		void deleteById(int id);
}
