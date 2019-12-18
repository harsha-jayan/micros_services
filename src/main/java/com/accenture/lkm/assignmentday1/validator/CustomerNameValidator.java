package com.accenture.lkm.assignmentday1.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CustomerNameValidator implements ConstraintValidator<CustomerNameValidatorAnnotation, String> {

	@Override
	public void initialize(CustomerNameValidatorAnnotation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String customerName, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(customerName.contains(" ")){
			return false;
		}
		if(customerName.matches("[a-zA-Z]+")){
			return false;
		}else{
			return true;
		}
		
	}

}
