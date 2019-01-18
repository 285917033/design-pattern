package com.wbd.builder_003.copy;

public class TestBuilder {

	public static void main(String[] args) {
	
		Decorator d1 = new ConcreteDecorator2();
		
		ProjectManager pm = new ProjectManager(d1);
		
		Parlour decorate = pm.decorate();
		
		System.out.println(decorate.getWall());
		System.out.println(decorate.getLamp());
		System.out.println(decorate.getTV());
		System.out.println(decorate.getSofa());
		
	}

}
