package com.accenture.lkm.assignmentday1.dao;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.lkm.assignmentday1.bean.Customer;
import com.accenture.lkm.assignmentday1.entity.CustomerEntity;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerEntity, Integer>{
	
	
	/*public Customer getCustomerDetailsById(int id){
		return mapOfEmloyees.get(id);
	}
	
	public Integer addCustomer(Customer customer){
		count++;
		customer.setCustomerId(count);
		mapOfEmloyees.put(count, customer);
		return count;
	}
	
	public Customer updateCustomer(Customer customer){
		mapOfEmloyees.put(customer.getCustomerId(), customer);
		return customer;
	}
	
	public Customer removeCustomer (int id){
		Customer customer= mapOfEmloyees.remove(id);
		return customer;
	}
*/

}
