package com.wbd.decorator_004;

/**
 * 基本功能， 跑 每个车必须的功能
 * 
 * @author jwh
 *
 */
public class RunCar implements Car {

	public void run() {

		System.out.println("可以跑");
	}

	public void show() {

		this.run();
	}

}
