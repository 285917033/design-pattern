package com.wbd.decorator_004;

/**
 * �������ܣ� �� ÿ��������Ĺ���
 * 
 * @author jwh
 *
 */
public class RunCar implements Car {

	public void run() {

		System.out.println("������");
	}

	public void show() {

		this.run();
	}

}
