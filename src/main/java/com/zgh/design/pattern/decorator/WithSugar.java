package com.zgh.design.pattern.decorator;

public class WithSugar extends CoffeeDecorator {

	public WithSugar(Coffee decoratedCoffee) {
		super(decoratedCoffee);
		
	}

	@Override
	public double getCost() {
		
		return super.getCost()+2;
	}
	
	@Override
	public String getIngredients() {
		String additionalIngredient="Sugar";
		return super.getIngredients()+","+additionalIngredient;
	}
}
