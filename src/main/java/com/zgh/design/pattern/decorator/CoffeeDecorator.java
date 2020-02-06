package com.zgh.design.pattern.decorator;
/**
 * coffee对象的装饰器类，实现coffee接口
 * coffee的装饰器，可以给coffee添加各种配料
 * @author zgh
 *
 */
public abstract class CoffeeDecorator implements Coffee {

	protected  Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee decoratedCoffee) {
		super();
		this.decoratedCoffee = decoratedCoffee;
	}

	//装饰器父类中，直接转发 请求到引用对象
	@Override
	public double getCost() {
		
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		
		return decoratedCoffee.getIngredients();
	}

}
