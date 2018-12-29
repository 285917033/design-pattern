package com.wbd.builder_003;
/**
 * ���彨���ӵĳ���,���̶ӣ�������һ����������house
 * @author jwh
 *
 */
public interface HouseBuilder {

	public void makeFloor();
	
	public void makeWall();
	
	public void makeHouseTop();
	
	public House getHouse();
}