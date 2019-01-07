package com.wbd.mediator_13;

public class TestMediator {

	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Person zs = new Man("张三",5,mediator);
		
		Person xf = new Woman("小芳",5,mediator);
		Person xq = new Woman("小倩",6,mediator);

		xf.getPartner(xq);
	}

}
