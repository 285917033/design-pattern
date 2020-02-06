package com.zgh.design.pattern.filter;
/**
 * ������ģʽ
 * 1.���˶���
 * 2.���������ӿڣ�������������Ľӿ�
 * 3.����Ĺ���������������Ҫʵ�ֹ��������ӿڵľ����������
 * @author zgh
 *
 */
public class Person { //���˵Ķ���

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
