package com.wbd.builder_003;

/**
 * ��������ʦ,��ָ���������̶���������,
 * ���ʦ��һ��ָ�����ã����彨���ӻ��ǹ��̶�
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
