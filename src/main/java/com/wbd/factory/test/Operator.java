package com.wbd.factory.test;

/**
 * 抽象类
 * 计算器采用 工厂模式进行实现
 * @author jwh
 *
 */
public abstract class Operator {
	
	private double number1;
	private double number2;
	
	public abstract double getResult();

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	
	
}
