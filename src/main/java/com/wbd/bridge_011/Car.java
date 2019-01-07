package com.wbd.bridge_011;
/**
 * �Ž�ģʽ�� ������ά�Ƚ��ж�����ֻ��߶�������
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
	
	
	//���󷽷�
	public abstract void installEngine();
	

}
