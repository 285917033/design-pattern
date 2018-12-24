package com.wbd.method.factory_002;

public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Banana();
	}

}
