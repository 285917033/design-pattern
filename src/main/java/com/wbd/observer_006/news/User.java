package com.wbd.observer_006.news;

import java.util.Observable;

/**
 * ���۲���,����̳�observable,
 * @author jwh
 *
 */
public class User extends Observable{
	
	public void publishMessage(Message message) {
		
		System.out.println("������Ϣ..");
		
		this.setChanged();
		//���۲��߰���Ϣ���ͳ�ȥ���۲��� ����ͨ��update��ȡ������Ϣ����
		this.notifyObservers(message);
	}

}
