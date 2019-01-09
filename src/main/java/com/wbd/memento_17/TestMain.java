package com.wbd.memento_17;

public class TestMain {

	public static void main(String[] args) {
		
		Person p = new Person("张三","男",30);
		
		

		Person backup = new Person();
		backup.setName(p.getName());
		backup.setAge(p.getAge());
		backup.setSex(p.getSex());
		
		p.display();
		
		//修改
		
		p.setName("李四");
		p.setAge(40);
		p.display();
		
		//还原，回滚
		p.setName(backup.getName());
		p.setSex(backup.getSex());
		p.setAge(backup.getAge());
		
		p.display();
	}

}
