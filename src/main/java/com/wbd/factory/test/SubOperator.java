package com.wbd.factory.test;

public class SubOperator extends Operator {

	@Override
	public double getResult() {
		return this.getNumber1()-this.getNumber2();
	}

}
