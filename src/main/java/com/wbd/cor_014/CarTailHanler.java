package com.wbd.cor_014;

public class CarTailHanler extends CarHandler {

	@Override
	public void handlerCar() {
		System.out.println("×é×°³µÎ²");
		if(this.carHandler!=null) {
		this.carHandler.handlerCar();
		}
	}

}
