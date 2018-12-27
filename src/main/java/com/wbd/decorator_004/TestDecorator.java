package com.wbd.decorator_004;
/**
 * ×°ÊÎÆ÷Ä£Ê½
 * @author jwh
 *
 */
public class TestDecorator {
	public static void main(String[] args) {
		Car car = new RunCar();
		
		car.show();
		System.out.println("---------");
		
		Car swinCar = new SwinCarDecorator(car);
		swinCar.show();
		
		System.out.println("---------");
		
		Car flyCar = new FlyCarDecorator(swinCar);
		flyCar.show();
		
		
	}

}
