package com.wbd.flyweight_007_news;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {
	
	private Map<String,Student> pool;
	
	public  StudentFactory () {
		
		this.pool = new HashMap<String,Student>();
	}
	
	public  Student getStudentByNumber(String number) {
		
		Student stu = pool.get(number);
		if(stu==null) {
			
			stu = new Student();
			stu.setNumber(number);
			pool.put(number, stu);
		}
		return stu;
	}

}
