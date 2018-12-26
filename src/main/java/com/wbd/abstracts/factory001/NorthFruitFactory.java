package com.wbd.abstracts.factory001;

public class NorthFruitFactory implements FruitFactory {

	public Fruit getApple() {
		return new NorthApple();
	}

	public Fruit getBanana() {
		return new NorthBanana();
	}

}
