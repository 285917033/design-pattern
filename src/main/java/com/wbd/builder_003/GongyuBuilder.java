package com.wbd.builder_003;

public class GongyuBuilder implements HouseBuilder {

	 House  house = new  House();
	 public void makeFloor() {
			
			System.out.println("��Ԣ----�ذ�");

		}

		public void makeWall() {
			System.out.println("��Ԣ----ǽ");

		}

		public void makeHouseTop() {
			System.out.println("��Ԣ----�ݶ�");

		}

		public House getHouse() {
		
			return house;
		}
}
