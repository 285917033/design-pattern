package com.wbd.observer_006;

import java.util.Observable;
/**
 * 被观察者， 必须继承Observable类
 * 当被观察者中有数据改变时，观察者会自动执行update方法
 * @author jwh
 *
 */
public class Person extends Observable {
	
	private String name;
	
	private String sex;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.setChanged();
		this.notifyObservers();
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.setChanged();
		this.notifyObservers();
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.setChanged();
		this.notifyObservers();
		this.age = age;
	}
	
	

}
