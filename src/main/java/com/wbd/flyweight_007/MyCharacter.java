package com.wbd.flyweight_007;

/**
 * ��Ԫģʽ�������Ǽ��ٶ����ڴ��ռ�ã�
 * 
 *  FlyweightģʽҲ����Ԫģʽ���ǹ�����ģʽ֮
һ����ͨ�����������ƶ�������������С�ڴ�
ռ�á�
 * @author jwh
 *
 */
public class MyCharacter {
	
	private char mychar;
	
	
	public MyCharacter(char mychar) {
		this.mychar = mychar;
	}

	
	public void display() {
		
		System.out.println("mychar="+mychar);
		
	}
	
}
