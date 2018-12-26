package com.wbd.factory.test;

public class T {

	public static void main(String[] args) {
	
		OperatorFactory factory = new AddOperatorFactory();
		
		Operator operator = factory.getOperator();

		operator.setNumber1(1);
		operator.setNumber2(2);
		
		System.out.println(operator.getResult());
		
		
		
		
	}

}
