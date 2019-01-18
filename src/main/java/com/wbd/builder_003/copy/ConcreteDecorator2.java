package com.wbd.builder_003.copy;

public class ConcreteDecorator2 extends Decorator {

	@Override
	public void buildWall() {
		
		product.setWall("简单装修");
	}

	@Override
	public void buildTV() {
		product.setTV("TCL电视");
	}

	@Override
	public void buildSofa() {
		product.setSofa("普通沙发");
	}

	@Override
	public void buildLamp() {
		product.setLamp("西门子灯");
	}

}
