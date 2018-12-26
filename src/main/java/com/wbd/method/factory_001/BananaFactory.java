package com.wbd.method.factory_001;

public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Banana();
	}

}
