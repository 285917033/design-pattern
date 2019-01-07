package com.wbd.cor_014;

public class TestCOR {

	public static void main(String[] args) {
		
		CarHandler  header = new CarHeaderHanler();
		CarHandler  body = new CarBodyHanler();
		CarHandler  tail = new CarTailHanler();
		
		header.setNextHandler(body).setNextHandler(tail);
		header.handlerCar();

	}

}
