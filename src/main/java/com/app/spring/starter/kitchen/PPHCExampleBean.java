package com.app.spring.starter.kitchen;

/**
 * This class is part of the demonstration for PropertyPlaceHolderConfigurer usage. 
 * @author juan.marcos
 *
 */
public class PPHCExampleBean {
	
	String exampleValue;
	
	public void printExampleValue() {
		System.out.println(exampleValue);
	}

	public String getExampleValue() {
		return exampleValue;
	}

	public void setExampleValue(String exampleValue) {
		this.exampleValue = exampleValue;
	}

}
