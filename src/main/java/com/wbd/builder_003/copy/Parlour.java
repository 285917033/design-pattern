package com.wbd.builder_003.copy;
/**
 * 装修客厅， 为产品，
 * 装修客厅，需要 买沙发，买电视，装修墙面，灯
 * 建造者模式，重视的是整个零部件的组装过程，
 * 建造者模式注重零部件的组装过程，
 * 而工厂方法模式更注重零部件的创建过程，但两者可以结合使用。
 * @author jwh
 *
 */
public class Parlour { //构造一个客厅
	
	private String wall;//墙
	private String TV;
	private String sofa; //沙发
	private String lamp; //灯
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getTV() {
		return TV;
	}
	public void setTV(String tV) {
		TV = tV;
	}
	public String getSofa() {
		return sofa;
	}
	public void setSofa(String sofa) {
		this.sofa = sofa;
	}
	public String getLamp() {
		return lamp;
	}
	public void setLamp(String lamp) {
		this.lamp = lamp;
	}

}
