package com.wbd.bridge_011;

public class SUV extends Car {

	public SUV(Engine engine) {
		super(engine);
		
	}

	@Override
	public void installEngine() {
		
		System.out.println("SUV....");
		this.getEngine().installEngine();

	}

}
