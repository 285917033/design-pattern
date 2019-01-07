package com.wbd.bridge_011;

public class Bus extends Car {

	public Bus(Engine engine) {
		super(engine);
		
	}

	@Override
	public void installEngine() {
		System.out.println("BUS....");
		this.getEngine().installEngine();

	}

}
