package com.zgh.design.pattern.factory;

public class Test {

	public static void main(String[] args) {
		
		Shape shape  =SimpleFactory.getShape("circle");
		
		shape.draw();
		

		Shape shape2  =SimpleFactory.getShape("square");
		
		shape2.draw();
		
       Shape shape3  =SimpleFactory.getShape("rectangle");
		
		shape3.draw();

	}

}
