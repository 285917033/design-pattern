package com.wbd.facade_009;

public class Facade {
	
	private SystemA  systemA;
	
	private SystemB  systemB;
	
	public Facade() {
		this.systemA = new SystemA();
		this.systemB = new SystemB();
	}
	
	
	public void doAB() {
		systemA.dosomething();
		systemB.dosomething();
	}
	
	public void doA() {
		systemA.dosomething();
	}

}
