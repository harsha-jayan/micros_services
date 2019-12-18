package com.accenture.lkm.assignmentday1.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerEntity {
	
	@Column(name="customername")
	private String customerName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customerid")
	private Integer customerId;
	
	@Column(name="bill")
	private double bill;
	
	@Column(name="billingdate")
	private Date billingDate;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	public CustomerEntity(String customerName, Integer customerId, double bill,
			Date billingDate) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.bill = bill;
		this.billingDate = billingDate;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerName=" + customerName + ", customerId="
				+ customerId + ", bill=" + bill + ", billingDate="
				+ billingDate + "]";
	}


}
