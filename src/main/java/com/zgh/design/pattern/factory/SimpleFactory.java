package com.zgh.design.pattern.factory;

/**
 * 简单工厂类
 * @author zgh
 *
 */
public class SimpleFactory {
	
	public static Shape getShape(String shapeName) {
		
		if(shapeName.equals("circle")) {
			
			return new Circle();
		}
		
		if(shapeName.equals("square")) {
			
			return new Square();
		}
		
		if(shapeName.equals("rectangle")) {
			
			return new Rectangle();
		}
		
		return null;
	}
	

}
