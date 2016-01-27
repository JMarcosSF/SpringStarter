package com.app.spring.starter.kitchen;


public class Potato implements Mashable {

	public void mash() {
		// TODO Auto-generated method stub
		System.out.println("Mashing potato!");
	}
	
	//Spring life cycle method example
	public void init() {
		System.out.println("Potato init...");
	}

	//Spring life cycle method example
	public void destroy() {
		System.out.println("Potato destroy...");
	}

}
