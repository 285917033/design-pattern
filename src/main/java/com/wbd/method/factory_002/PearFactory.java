package com.wbd.method.factory_002;

public class PearFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Pear();
	}

}
