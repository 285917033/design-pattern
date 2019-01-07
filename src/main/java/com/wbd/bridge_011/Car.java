package com.wbd.bridge_011;
/**
 * 桥接模式， 将两个维度进行独立拆分或者独立抽象
 * @author jwh
 *
 */
public abstract class Car {
	
	private Engine engine;
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	//抽象方法
	public abstract void installEngine();
	

}
