package com.wbd.abstracts.factory001;

public class TestAbstractFactory {

	public static void main(String[] args) {
	
		FruitFactory ff = new SouthFruitFactory();
		
		Fruit apple = ff.getApple();
		
		apple.get();
		
		Fruit banana = ff.getBanana();
		
		banana.get();

	}

}
