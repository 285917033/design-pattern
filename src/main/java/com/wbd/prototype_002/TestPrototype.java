package com.wbd.prototype_002;

import java.util.ArrayList;
import java.util.List;

/**
 * ԭ��ģʽ����һ�ֶ��󴴽�ģʽ������
ȡ����ԭ�Ͷ���ķ��������������ʵ����ʹ��
Prototypeģʽ������ʵ����������ԭ��һ����
���ݡ�
 * @author jwh
 *
 */
public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person();
		List<String> list1 = new ArrayList<String>();
		
		list1.add("hello");
		list1.add("world");
		
		p1.setFried(list1);
		p1.setName("hello");
		p1.setAge(20);
		p1.setSex("��");
		
		
		Person p2 = p1.clone();
		p2.setName("����");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getSex());
		System.out.println(p1.getFried());
		
		System.out.println(p2.getFried());
		
		System.out.println("-----------------------");
		
		list1.add("java");
		p1.setFried(list1);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getSex());
		System.out.println(p1.getFried());
		System.out.println("**************");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getSex());
		System.out.println(p2.getFried());

	}

}
