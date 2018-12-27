package com.wbd.decorator_004;

public class SwinCarDecorator extends CarDecorator {

	public SwinCarDecorator(Car car) {
		super(car);
	}

	public void run() {

	}

	@Override
	public void show() {
		this.getCar().show();
		this.swin();

	}

	public void swin() {
		System.out.println("©иртсн");
	}

}
