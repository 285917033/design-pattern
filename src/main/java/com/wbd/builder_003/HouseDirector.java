package com.wbd.builder_003;

/**
 * 具体的设计师,来指定建筑工程对来建房子,
 * 设计师起一个指挥作用，具体建房子还是工程队
 * @author jwh
 *
 */
public class HouseDirector {
	
	public void makeHouse(HouseBuilder builder) {
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
	}

}
