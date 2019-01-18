package com.wbd.builder_003.copy;

public class ConcreteDecorator1 extends Decorator {

	@Override
	public void buildWall() {
		
		product.setWall("����װ��");
		
		
	}

	@Override
	public void buildTV() {
		product.setTV("��ά����");
	}

	@Override
	public void buildSofa() {
		product.setSofa("�˼�ɳ��");
	}

	@Override
	public void buildLamp() {
		product.setLamp("�����ֵ�");
	}

}
