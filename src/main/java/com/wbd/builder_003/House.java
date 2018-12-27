package com.wbd.builder_003;

/**
 * 建造者模式，也是一种对象创建模型之一，用来隐藏复合对象的创建过程
 * 把复合对象创建的过程加以抽象，
 * @author jwh，
 *
 */
public class House {

	
	private String floor;
	
	private String wall;
	
	private String houseTop;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getHouseTop() {
		return houseTop;
	}

	public void setHouseTop(String houseTop) {
		this.houseTop = houseTop;
	}
	
	
}
