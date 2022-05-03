package com.example.customerser.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.customerser.customer.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

	



	

}
