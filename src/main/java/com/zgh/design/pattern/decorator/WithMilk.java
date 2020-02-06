package com.zgh.design.pattern.decorator;
/**
 * 此装饰类混合"牛奶"到原味咖啡中
 */
public class WithMilk extends CoffeeDecorator {

	public WithMilk(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}

	
	@Override
	public double getCost() {
		double additionalCost=1;
		return super.getCost()+additionalCost;
	}
	
	@Override
	public String getIngredients() {
		String additionalIngredient="milk";
		return super.getIngredients()+","+additionalIngredient;
	}
}
