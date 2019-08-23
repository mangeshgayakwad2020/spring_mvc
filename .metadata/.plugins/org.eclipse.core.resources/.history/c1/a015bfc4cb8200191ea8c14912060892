package com.greatdigitallab.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = GameCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GameCode {

	// Define default Game Code value
	public String value() default "GDL";
	
	// Define default Error Message
	public String message() default "must start with GDL";
	
	// Define default groups
	public Class<?>[] groups() default {};
	
	// Define default payloads
	public Class<? extends Payload>[] payload() default {};
}
