package com.wbd.memento_17_01;
/**
 * 备忘录模式
 * @author jwh
 *
 */
public class Person {
	
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
	
	public void display() {
		System.out.println("name:" + name + ",sex:" + sex + ",age:" + age);
	}

	//创建一个备份
	
	public Memento createMemento() {
		
		return new Memento(name,sex,age);
	}
	
	//回复，回滚
	
	public void setMemento(Memento memento) {
		this.name=memento.getName();
		this.age = memento.getAge();
		this.sex = memento.getSex();
		
	}
}
