package com.wbd.method.factory_001;

public class PearFactory implements FruitFactory {

	public Fruit getFruit() {
		
		return new Pear();
	}

}
