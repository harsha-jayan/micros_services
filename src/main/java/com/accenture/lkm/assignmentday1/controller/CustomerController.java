package com.accenture.lkm.assignmentday1.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.assignmentday1.bean.Customer;
import com.accenture.lkm.assignmentday1.dao.CustomerDAO;
import com.accenture.lkm.assignmentday1.service.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@RequestMapping(value="customer/controller/getDetails",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Customer>> getCustomerDetails() {

		System.out.println("helolo:::");
		Collection <Customer> listCustomer1 = customerServiceImpl.getCustomerDetails();
		System.out.println(listCustomer1);
		return new ResponseEntity<Collection<Customer>>(listCustomer1, HttpStatus.OK);
	}
	
	@RequestMapping(value="customer/controller/addCustomer",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addCustomer(@Valid @RequestBody Customer customer, Errors err){
		if(err.hasErrors()){
			return new ResponseEntity<String>(err.getAllErrors()+"",HttpStatus.BAD_REQUEST);
		}
		int id= customerServiceImpl.addCustomer(customer);
		return new ResponseEntity<String>("Customer added successfully with id:"+id,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/customer/{id}", 
			produces = { "application/json", "application/xml" }, 
			method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		return customerServiceImpl.getCustomerDetailByCustomerId(id);
	}

/*
	@RequestMapping(value = "/controller/addCustomer", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces =
			MediaType.TEXT_HTML_VALUE) public ResponseEntity<String>
	addCustomer(@RequestBody Customer customer) {

		int count=customerDAO.addCustomer(customer); 
		return new ResponseEntity<String>("Employee added successfully with id:" +count,HttpStatus.CREATED); 
		}
	
	@RequestMapping(value = "/controller/updateCustomer", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> updateEmployee(@RequestBody  Customer customer) {
		System.out.println(">>>"+customer);
		if (customerDAO.getCustomerDetailsById(customer.getCustomerId()) == null) {
			Customer customer2 = null;
			return new ResponseEntity<Customer>(customer,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		Customer updated = customerDAO.updateCustomer(customer);
		return new ResponseEntity<Customer>(updated, HttpStatus.OK);
	}

	@RequestMapping(value = "/controller/deleteCustomer/{id}", method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Customer> deleteEmployee(@PathVariable("id") int myId) {
				if (customerDAO.getCustomerDetailsById(myId) == null) {
					Customer customer2 = null;
					return new ResponseEntity<Customer>(customer2,HttpStatus.INTERNAL_SERVER_ERROR);
				}
				Customer customer = customerDAO.removeCustomer(myId);
				return new ResponseEntity<Customer>(customer, HttpStatus.OK);
			}
*/


}
