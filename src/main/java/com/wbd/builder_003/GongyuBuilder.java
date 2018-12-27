package com.wbd.builder_003;

public class GongyuBuilder implements HouseBuilder {

	 House  house = new  House();
	 public void makeFloor() {
			
			System.out.println("¹«Ô¢----µØ°å");

		}

		public void makeWall() {
			System.out.println("¹«Ô¢----Ç½");

		}

		public void makeHouseTop() {
			System.out.println("¹«Ô¢----ÎÝ¶¥");

		}

		public House getHouse() {
		
			return house;
		}
}
