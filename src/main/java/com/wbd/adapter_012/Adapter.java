package com.wbd.adapter_012;

/**
 * ����������
 * @author jwh
 *
 */
public class Adapter {

	private Current current;

	public Adapter(Current current) {
		super();
		this.current = current;
	}
	
	
	public void use18V() {
		
		System.out.println("ʹ��������");
		this.current.use220V();
	}
	
}
