package com.wbd.builder_003;
/**
 * ���彨���ӵĳ���,���̶ӣ�������һ����������house
 * �����ߣ�Builder��ģʽ�͹���ģʽ�Ĺ�ע�㲻ͬ��������ģʽע���㲿������װ���̣�
 * ����������ģʽ��ע���㲿���Ĵ������̣������߿��Խ��ʹ�á�
 * @author jwh
 *
 */
public interface HouseBuilder {

	public void makeFloor();
	
	public void makeWall();
	
	public void makeHouseTop();
	
	public House getHouse();
}
