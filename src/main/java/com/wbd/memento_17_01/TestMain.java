package com.wbd.memento_17_01;

public class TestMain {

	public static void main(String[] args) {
		
		Person p = new Person("����","��",30);
		
		Caretaker c = new Caretaker();
		c.setMemento(p.createMemento());
		
		p.display();
		
		//�޸�
		
		p.setName("����");
		p.setAge(40);
		p.display();
		
		//��ԭ���ع�
		p.setMemento(c.getMemento());
		
		p.display();
	}

}
