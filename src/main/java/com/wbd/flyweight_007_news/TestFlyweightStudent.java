package com.wbd.flyweight_007_news;

public class TestFlyweightStudent {

	public static void main(String[] args) {
	
		StudentFactory sf = new StudentFactory();
		Student st = sf.getStudentByNumber("110");
		st.setAge(110);
		Student st2 = sf.getStudentByNumber("111");
		Student st3 = sf.getStudentByNumber("110");
		System.out.println(st3.getAge());
		
		System.out.println(st==st3);
		System.out.println(st2.getName());
		System.out.println(st.getNumber());

	}

}
