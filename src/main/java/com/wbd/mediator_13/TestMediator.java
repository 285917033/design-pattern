package com.wbd.mediator_13;

public class TestMediator {

	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Person zs = new Man("����",5,mediator);
		
		Person xf = new Woman("С��",5,mediator);
		Person xq = new Woman("Сٻ",6,mediator);

		xf.getPartner(xq);
	}

}
