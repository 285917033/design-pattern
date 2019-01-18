package com.wbd.builder_003.copy;

public class ConcreteDecorator2 extends Decorator {

	@Override
	public void buildWall() {
		
		product.setWall("��װ��");
	}

	@Override
	public void buildTV() {
		product.setTV("TCL����");
	}

	@Override
	public void buildSofa() {
		product.setSofa("��ͨɳ��");
	}

	@Override
	public void buildLamp() {
		product.setLamp("�����ӵ�");
	}

}
