package com.wbd.cor_014;
/**
 * 职责链模式， 过滤器就是采用该思想
 * @author jwh
 *
 */
public abstract class CarHandler {
	
	protected  CarHandler carHandler;
	
	public CarHandler setNextHandler(CarHandler carHandler) {
		this.carHandler = carHandler;
		return this.carHandler;
	}

	public abstract void handlerCar();
}
