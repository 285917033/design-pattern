package com.zgh.design.pattern.decorator;
/**
 * ԭζcoffee
 * @author zgh
 *
 */
public class SimpleCoffee implements Coffee {

	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "simple coffee";
	}

}
