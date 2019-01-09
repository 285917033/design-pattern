package com.wbd.memento_17_01;

public class TestMain {

	public static void main(String[] args) {
		
		Person p = new Person("张三","男",30);
		
		Caretaker c = new Caretaker();
		c.setMemento(p.createMemento());
		
		p.display();
		
		//修改
		
		p.setName("李四");
		p.setAge(40);
		p.display();
		
		//还原，回滚
		p.setMemento(c.getMemento());
		
		p.display();
	}

}
