package com.wbd.cor_014;

public class CarHeaderHanler extends CarHandler {

	@Override
	public void handlerCar() {
		System.out.println("组装车头");
		if(this.carHandler!=null) {
			this.carHandler.handlerCar();
			}

	}

}
