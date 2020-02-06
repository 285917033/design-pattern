package com.zgh.design.pattern.factory;

/**
 * �򵥹�����
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
