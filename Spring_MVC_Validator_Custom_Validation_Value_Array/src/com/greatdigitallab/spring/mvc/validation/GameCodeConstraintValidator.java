package com.greatdigitallab.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GameCodeConstraintValidator implements ConstraintValidator<GameCode, String> {

	private String[] codePrefixes;
	
	@Override
	public void initialize(GameCode gameCode) {
		codePrefixes = gameCode.value();
	}
	
	@Override
	public boolean isValid(String gameCode, ConstraintValidatorContext arg1) {
		
		boolean result = false;
		if(gameCode!=null) {
			for(String str : codePrefixes) {
				result = gameCode.startsWith(str);
				if(result) {
					break;
				}
			}
		}else {
			result = false;
		}
				
		return result;
	}

}
