package com.wbd.cor_014;
/**
 * ְ����ģʽ�� ���������ǲ��ø�˼��
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
