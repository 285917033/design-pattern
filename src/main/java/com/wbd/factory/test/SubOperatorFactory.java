package com.wbd.factory.test;

public class SubOperatorFactory implements OperatorFactory {

	public Operator getOperator() {
		return new SubOperator();
	}

}
