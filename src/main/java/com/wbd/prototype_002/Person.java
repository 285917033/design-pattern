package com.wbd.prototype_002;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * 原型模式， 必须实现对应的接口，实现clone方法
 * 
 *1 浅克隆：只负责克隆不可变类型的数据（比如基本数据类型、String类型），而不复制它所引用的对象，换言之，所有的对其他对象的引用都仍然指向原来的对象。具体做法是实现Cloneable接口，覆盖Object的clone()方法。
  2.深度复制表示额外再负责一个对象，
 * 额外产生一个内存地址， 一般对引用数据类型采取深度复制
 * 
 * 根据对象克隆深度层次的不同，有浅度克隆与深度克隆。
 * 
 * @author jwh
 *
 */
public class Person implements Cloneable {

	private String name;

	private int age;

	private String sex;

	private List<String> fried; // 对引用数据类型， 可以采用浅复制和深复制，一般采用深度复制

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
		// 深度复制，一般用在引用数据类型
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
