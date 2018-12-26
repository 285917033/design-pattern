package com.wbd.prototype_002;

import java.util.ArrayList;
import java.util.List;

/**
 * ԭ��ģʽ�� ����ʵ�ֶ�Ӧ�Ľӿڣ�ʵ��clone����
 * 1��һ������������Ͱ���String���ͣ�������ȸ��ƣ�������������Ĭ�ϲ��õ���ǳ���ƣ�ֻ���������ã�
 * 2.��ȸ��Ʊ�ʾ�����ڸ���һ������ �������һ���ڴ��ַ�� һ��������������Ͳ�ȡ��ȸ��� 
 * @author jwh
 *
 */
public class Person implements Cloneable{

	private String name;
	
	private int age;
	
	private String sex;
	
	private List<String> fried; //�������������ͣ� ���Բ���ǳ���ƺ���ƣ�һ�������ȸ��� 

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
		//��ȸ��ƣ�һ������������������
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
