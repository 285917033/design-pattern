package com.wbd.builder_003;

public class TestBuilder {

	public static void main(String[] args) {
	
		//1.���̶���������
		//HouseBuilder builder = new PingfangBuilder();
		
		HouseBuilder builder = new GongyuBuilder();
		//2.���ʦ��ָ�ӹ���ʦ��ô����������
		HouseDirector hd = new HouseDirector();
		hd.makeHouse(builder);
		
		House house = builder.getHouse();
		
				

	}

}
