package com.wbd.observer_006;

public class TestObserver {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.addObserver(new MyObServer());
		p.addObserver(new MyObServer());
		p.setName("hello world");
		System.out.println(p.countObservers());
		

	}

}
