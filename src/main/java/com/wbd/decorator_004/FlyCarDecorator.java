package com.wbd.decorator_004;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);

	}

	public void run() {
		
	}

	@Override
	public void show() {
	this.getCar().show();
	this.fly();

	}
	
	public void fly() {
		System.out.println("©ирт╥и");
	}

}
