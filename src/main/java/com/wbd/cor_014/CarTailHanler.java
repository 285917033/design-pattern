package com.wbd.cor_014;

public class CarTailHanler extends CarHandler {

	@Override
	public void handlerCar() {
		System.out.println("��װ��β");
		if(this.carHandler!=null) {
		this.carHandler.handlerCar();
		}
	}

}
