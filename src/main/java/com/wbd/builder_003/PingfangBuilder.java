package com.wbd.builder_003;
/**
 * ƽ���������̶���������
 * @author jwh
 *
 */
public class PingfangBuilder implements HouseBuilder {

	 House  house = new  House();
	
	public void makeFloor() {
	
		System.out.println("ƽ��----�ذ�");

	}

	public void makeWall() {
		System.out.println("ƽ��----ǽ");

	}

	public void makeHouseTop() {
		System.out.println("ƽ��----�ݶ�");

	}

	public House getHouse() {
	
		return house;
	}

}
