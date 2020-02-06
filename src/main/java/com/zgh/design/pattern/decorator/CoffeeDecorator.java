package com.zgh.design.pattern.decorator;
/**
 * coffee�����װ�����࣬ʵ��coffee�ӿ�
 * coffee��װ���������Ը�coffee��Ӹ�������
 * @author zgh
 *
 */
public abstract class CoffeeDecorator implements Coffee {

	protected  Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee decoratedCoffee) {
		super();
		this.decoratedCoffee = decoratedCoffee;
	}

	//װ���������У�ֱ��ת�� �������ö���
	@Override
	public double getCost() {
		
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		
		return decoratedCoffee.getIngredients();
	}

}
