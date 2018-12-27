package com.wbd.builder_003;
/**
 * 具体建房子的抽象,工程队，必须有一个方法返回house
 * @author jwh
 *
 */
public interface HouseBuilder {

	public void makeFloor();
	
	public void makeWall();
	
	public void makeHouseTop();
	
	public House getHouse();
}
