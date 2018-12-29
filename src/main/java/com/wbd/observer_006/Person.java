package com.wbd.observer_006;

import java.util.Observable;
/**
 * ���۲��ߣ� ����̳�Observable��
 * �����۲����������ݸı�ʱ���۲��߻��Զ�ִ��update����
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
