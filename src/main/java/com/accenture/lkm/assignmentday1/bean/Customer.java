package com.accenture.lkm.assignmentday1.bean;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.accenture.lkm.assignmentday1.validator.CustomerNameValidatorAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;

@XmlRootElement
public class Customer {
	
	private Integer customerId;
	
	@CustomerNameValidatorAnnotation(message="{Customer.CustomerValidatorValMessage}")
	@NotEmpty(message="{NotEmpty.customer.name}")
	private String customerName;
	
	private double bill;
	
	@Temporal(TemporalType.DATE)
	private Date billingDate;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Customer(Integer customerId, String customerName, double bill, Date billingDate) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.bill = bill;
		this.billingDate = billingDate;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
