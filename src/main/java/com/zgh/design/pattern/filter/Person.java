package com.zgh.design.pattern.filter;
/**
 * 过滤器模式
 * 1.过滤对象
 * 2.过滤条件接口，抽象过滤条件的接口
 * 3.具体的过滤条件，根据需要实现过滤条件接口的具体过滤条件
 * @author zgh
 *
 */
public class Person { //过滤的对象

	private String name;
	
	private String sex;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Person() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
