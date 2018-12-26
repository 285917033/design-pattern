package com.wbd.method.factory_001;

public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Apple();
	}

}
