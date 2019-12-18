package com.accenture.lkm.assignmentday1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.assignmentday1.bean.Customer;
import com.accenture.lkm.assignmentday1.dao.CustomerDAO;
import com.accenture.lkm.assignmentday1.entity.CustomerEntity;


@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerDAO customerDAO;
	
	public Collection<Customer> getCustomerDetails(){
		Collection<CustomerEntity> collec =customerDAO.findAll();
		List<Customer> listCustomer = new ArrayList<Customer> ();
		for (CustomerEntity customerEntity : collec) {
			Customer customer=new Customer();
			BeanUtils.copyProperties(customerEntity, customer);
			listCustomer.add(customer);
		}
		return listCustomer;
	}
	public int addCustomer(Customer customer) {

		CustomerEntity customerEntity = new CustomerEntity();
		BeanUtils.copyProperties(customer, customerEntity);
		CustomerEntity cus= (CustomerEntity)customerDAO.save(customerEntity);
		System.out.println(cus);
		return cus.getCustomerId();
	}
	
	public Customer getCustomerDetailByCustomerId(int customerId){
		Customer customer =null;
		
		//Implementation of the DAO method will be provided  by the run time proxy
		CustomerEntity employeeEntity= customerDAO.findOne(customerId);
		
		if(employeeEntity!=null){
			customer= new Customer();
			BeanUtils.copyProperties(employeeEntity, customer);
		}
		return customer;
	}

}
