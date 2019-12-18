package com.accenture.lkm.assignmentday1.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = CustomerNameValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerNameValidatorAnnotation {
	   String message() default ""; // can be applied on string fields
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};
}
