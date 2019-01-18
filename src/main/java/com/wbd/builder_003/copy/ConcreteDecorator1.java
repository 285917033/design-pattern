package com.wbd.builder_003.copy;

public class ConcreteDecorator1 extends Decorator {

	@Override
	public void buildWall() {
		
		product.setWall("豪华装修");
		
		
	}

	@Override
	public void buildTV() {
		product.setTV("创维电视");
	}

	@Override
	public void buildSofa() {
		product.setSofa("宜家沙发");
	}

	@Override
	public void buildLamp() {
		product.setLamp("飞利浦灯");
	}

}
