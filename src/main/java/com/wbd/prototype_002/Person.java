package com.wbd.prototype_002;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式， 必须实现对应的接口，实现clone方法
 * 1，一般基本数据类型包括String类型，都会深度复制，引用数据类型默认采用的是浅复制，只复制了引用，
 * 2.深度复制表示额外在负责一个对象， 额外产生一个内存地址， 一般对引用数据类型采取深度复制 
 * @author jwh
 *
 */
public class Person implements Cloneable{

	private String name;
	
	private int age;
	
	private String sex;
	
	private List<String> fried; //对引用数据类型， 可以采用浅复制和深复制，一般采用深度复制 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
	
		Person p = (Person) super.clone();
		//深度复制，一般用在引用数据类型
		List<String> newList = new ArrayList<String>();
		for (String s : this.getFried()) {
			newList.add(s);
		}
		
		p.setFried(newList);
		return p;
	}

	public List<String> getFried() {
		return fried;
	}

	public void setFried(List<String> fried) {
		this.fried = fried;
	}
	
	
	
	
	
}
