package com.app.spring.starter.kitchen;

import java.util.List;
 
public class Kitchen {
	
	String hello;
	
	Mashable mashThing;
	
	public List kitchenWareList;
	

	public Kitchen() {
		
	}
	
	// Constructor Injection
	public Kitchen(final Mashable mashThing) {
		this.mashThing = mashThing;
	}

	public Mashable getMashThing() {
		return mashThing;
	}

	public void setMashThing(Mashable mashThing) {
		this.mashThing = mashThing;
	}


	public void printHelloWorld() {
		System.out.println("Hello, " + hello);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
 
	public List getKitchenWareList() {
		return kitchenWareList;
	}
	
	public void setKitchenWareList(List kitchenWareList) {
		this.kitchenWareList = kitchenWareList;
	}

}