package com.wbd.adapter_012;

/**
 * 对象适配器
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
		
		System.out.println("使用适配器");
		this.current.use220V();
	}
	
}
