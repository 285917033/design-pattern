package com.wbd.builder_003;

public class TestBuilder {

	public static void main(String[] args) {
	
		//1.工程对来做房子
		//HouseBuilder builder = new PingfangBuilder();
		
		HouseBuilder builder = new GongyuBuilder();
		//2.设计师来指挥工程师怎么具体做房子
		HouseDirector hd = new HouseDirector();
		hd.makeHouse(builder);
		
		House house = builder.getHouse();
		
				

	}

}
