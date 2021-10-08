package com.state.pizza;

public class FeedBack implements PizzaState {

	Pizza pizza;
	
	
	public FeedBack(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public void bakePizza() {
		// TODO Auto-generated method stub
       System.out.println("Baking done ");
	}

	@Override
	public void cutPizza() {
		// TODO Auto-generated method stub
		System.out.println("Cutting  done ");
	}

	@Override
	public void packPizza() {
		// TODO Auto-generated method stub
		System.out.println("Packing  done ");
	}


	@Override
	public void servePizza() {
		// TODO Auto-generated method stub
       System.out.println("Serving done ");
	}

	@Override
	public void feedBack() {
		// TODO Auto-generated method stub
        System.out.println( "Start collecting the feedback ");
        pizza.setState(pizza.getFeedback());
	}

}
