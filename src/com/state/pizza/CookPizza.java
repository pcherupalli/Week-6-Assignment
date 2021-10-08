package com.state.pizza;

import com.builder.pizza.PizzaProp;
import com.builder.pizza.Pizzabuilder;

public class CookPizza {
	
	public static void main(String[] args) {
		
		//Builder Pattern to order pizza
		PizzaProp margarita = new Pizzabuilder().setPizzaName("Margarita").setTypeOfCrust("Hand toast").setPrice(120).build();
		PizzaProp veggie = new Pizzabuilder().setPizzaName("veggie").setTypeOfCrust("PanCrust ").setPrice(180).build();

		System.out.println(margarita);
		System.out.println(veggie);
		
		//State pattern to cook pizza
		Pizza pizza = new Pizza();
		
		pizza.cookPizza();
		pizza.slicePizza();
		pizza.packPizza();
		pizza.servePizza();
		pizza.getFeedBackCustomer();
		
	}

}
