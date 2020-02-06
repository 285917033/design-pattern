package com.zgh.design.pattern.bridge;

public class T {

	public static void main(String[] args) {
		Color white = new White();
		Shape square = new Square();
		square.setColor(white);
		square.draw();
		
		Shape circle = new Circle();
		circle.setColor(white);
		circle.draw();
	}

}
