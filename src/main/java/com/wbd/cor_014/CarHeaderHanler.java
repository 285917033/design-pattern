package com.wbd.cor_014;

public class CarHeaderHanler extends CarHandler {

	@Override
	public void handlerCar() {
		System.out.println("��װ��ͷ");
		if(this.carHandler!=null) {
			this.carHandler.handlerCar();
			}

	}

}
