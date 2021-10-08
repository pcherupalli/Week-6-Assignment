package com.builder.pizza;

public class PizzaProp {
	
	
	private String pizzaName;
	
	private String typeOfCrust;
	
	private Integer price;
	
	

	public PizzaProp(String pizzaName, String typeOfCrust, Integer price) {
		super();
		this.pizzaName = pizzaName;
		this.typeOfCrust = typeOfCrust;
		this.price = price;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getTypeOfCrust() {
		return typeOfCrust;
	}

	public void setTypeOfCrust(String typeOfCrust) {
		this.typeOfCrust = typeOfCrust;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaProp [pizzaName=" + pizzaName + ", typeOfCrust=" + typeOfCrust + ", price=" + price + "]";
	}
	
	

}
