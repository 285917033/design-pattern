package com.wbd.simple.factory_001;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		Fruit apple = (Apple) SimpleFactory.getFruit("com.wbd.simple.factory_001.Apple");
		Fruit banana = (Banana) SimpleFactory.getFruit("com.wbd.simple.factory_001.Banana");
		
		apple.get();
		banana.get();

	}

}
