package com.wbd.memento_17;

public class TestMain {

	public static void main(String[] args) {
		
		Person p = new Person("����","��",30);
		
		

		Person backup = new Person();
		backup.setName(p.getName());
		backup.setAge(p.getAge());
		backup.setSex(p.getSex());
		
		p.display();
		
		//�޸�
		
		p.setName("����");
		p.setAge(40);
		p.display();
		
		//��ԭ���ع�
		p.setName(backup.getName());
		p.setSex(backup.getSex());
		p.setAge(backup.getAge());
		
		p.display();
	}

}
