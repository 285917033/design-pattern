package com.wbd.method.factory_002;

public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Apple();
	}

}
