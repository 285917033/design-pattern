package com.wbd.cor_014;

public class CarBodyHanler extends CarHandler {

	@Override
	public void handlerCar() {
		System.out.println("组装车身");
		if(this.carHandler!=null) {
			this.carHandler.handlerCar();
			}

	}

}
