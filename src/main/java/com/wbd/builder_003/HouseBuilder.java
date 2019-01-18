package com.wbd.builder_003;
/**
 * 具体建房子的抽象,工程队，必须有一个方法返回house
 * 建造者（Builder）模式和工厂模式的关注点不同：建造者模式注重零部件的组装过程，
 * 而工厂方法模式更注重零部件的创建过程，但两者可以结合使用。
 * @author jwh
 *
 */
public interface HouseBuilder {

	public void makeFloor();
	
	public void makeWall();
	
	public void makeHouseTop();
	
	public House getHouse();
}
