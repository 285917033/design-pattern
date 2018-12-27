package com.wbd.decorator_004;

public abstract class CarDecorator  implements Car{

	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	//带一个参数的构造器
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	
	public abstract void show();
	
	
}
