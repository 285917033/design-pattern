package com.wbd.builder_003;
/**
 * 平房建筑工程对来建房子
 * @author jwh
 *
 */
public class PingfangBuilder implements HouseBuilder {

	 House  house = new  House();
	
	public void makeFloor() {
	
		System.out.println("平房----地板");

	}

	public void makeWall() {
		System.out.println("平房----墙");

	}

	public void makeHouseTop() {
		System.out.println("平房----屋顶");

	}

	public House getHouse() {
	
		return house;
	}

}
