package com.wbd.mediator_13;

public class Woman extends Person {

	public Woman(String name, int condition, Mediator mediator) {
		super(name, condition, mediator);
	}

	@Override
	public void getPartner(Person person) {
		
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(person);

	}

}
