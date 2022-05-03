package com.example.customerser.customer.service;

import java.util.List;

import com.example.customerser.customer.model.Customer;

public interface CustomerService {
	public List<Customer> allcustomer();
	public String addcustomer (Customer c);
	public List<Customer> updatecustomer();
	public String deletecustomer(int customer_id );

	//public Optional <Customer> searchById(int id);

}
