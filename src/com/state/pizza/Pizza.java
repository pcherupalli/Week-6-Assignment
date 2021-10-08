package com.state.pizza;

public class Pizza {
	
	
	PizzaState bakePizza;
	
	PizzaState cutPizza;
	
	PizzaState packPizza;
	
	PizzaState servePizza;
	
	PizzaState feedback;
	
	
	PizzaState state;
	
	
	public Pizza () {
		
		bakePizza = new BakePizza(this);
		cutPizza = new CutPizaa(this);
		packPizza = new PackPizza(this);
		servePizza = new ServePizza(this);
		feedback = new FeedBack(this);
		state= bakePizza;
		
	}

	// Getters and setters
	public PizzaState getBakePizza() {
		return bakePizza;
	}


	public void setBakePizza(PizzaState bakePizza) {
		this.bakePizza = bakePizza;
	}


	public PizzaState getCutPizza() {
		return cutPizza;
	}


	public void setCutPizza(PizzaState cutPizza) {
		this.cutPizza = cutPizza;
	}


	public PizzaState getPackPizza() {
		return packPizza;
	}


	public void setPackPizza(PizzaState packPizza) {
		this.packPizza = packPizza;
	}


	public PizzaState getState() {
		return state;
	}


	public void setState(PizzaState state) {
		this.state = state;
	}
	
	public PizzaState getServePizza() {
		return servePizza;
	}

	public void setServePizza(PizzaState servePizza) {
		this.servePizza = servePizza;
	}

	public PizzaState getFeedback() {
		return feedback;
	}

	public void setFeedback(PizzaState feedback) {
		this.feedback = feedback;
	}

	//Methods 
	public void cookPizza() {
		state.bakePizza();
	}

	public void slicePizza() {
		state.cutPizza();
	}
	
	public void packPizza() {
		state.packPizza();
	}
	
	public void servePizza() {
		state.servePizza();
	}
	
	public void getFeedBackCustomer() {
		state.feedBack();
	}
	
}
