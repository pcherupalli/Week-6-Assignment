package com.builder.pizza;

public class Pizzabuilder {
	
	
    private String pizzaName;
	
	private String typeOfCrust;
	
	private Integer price;

	public Pizzabuilder setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
		return this;
	}

	public Pizzabuilder setTypeOfCrust(String typeOfCrust) {
		this.typeOfCrust = typeOfCrust;
		return this;
	}

	public Pizzabuilder setPrice(Integer price) {
		this.price = price;
		return this;
	}
	
	public PizzaProp build() {
		
		return new PizzaProp(pizzaName, typeOfCrust, price);
		
	}
	

}
