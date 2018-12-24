package com.wbd.simple.factory_001;
/**
 * 1.简单工厂模式
 * @author jwh
 *
 */
public class SimpleFactory {
	
	
	public static Fruit getFruit(String type) {
		Fruit fruit = null;
		try {
			Class clz = Class.forName(type);
			 fruit = (Fruit) clz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return fruit;
	}

}
