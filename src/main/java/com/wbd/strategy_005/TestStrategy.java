package com.wbd.strategy_005;

public class TestStrategy {

	public static void main(String[] args) {

		Context context = new Context(new RSAStrategy());
		
		context.encrypt();
	}

}
