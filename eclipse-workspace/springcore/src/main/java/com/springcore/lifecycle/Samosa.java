package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting perice");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init() {
		 System.out.println("init");
	}
	
	public void destroy() {
		 System.out.println("destroy");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
}
