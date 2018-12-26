package com.wbd.factory.test;

public class AddOperatorFactory implements OperatorFactory {

	public Operator getOperator() {
		return new AddOperator();
	}

}
