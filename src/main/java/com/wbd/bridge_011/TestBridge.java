package com.wbd.bridge_011;

public class TestBridge {

	public static void main(String[] args) {
	
		Engine t1 = new Engine1T();
		Engine t2 = new Engine2T();
		
		Car  bus = new Bus(t1);
		
		bus.installEngine();
		
		Car suv = new SUV(t2);
		
		suv.installEngine();

	}

}
