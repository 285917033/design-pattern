package com.zgh.design.pattern.builder;

public class Test {

	public static void main(String[] args) {
		Builder  cb  = new ConcreteBuilder();
		Product p = cb.builderA("A").build();
		
		System.out.println(p.getBuildB());
		System.out.println(p.getBuildA());
	}

}
