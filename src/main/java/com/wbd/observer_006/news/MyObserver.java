package com.wbd.observer_006.news;

import java.util.Observable;
import java.util.Observer;
/**
 * �۲��߱���ʵ��Observer�ӿ�
 * @author jwh
 *
 */
public class MyObserver implements Observer {

	public void update(Observable o, Object arg) {
		//���ձ��۲��߷�������Ϣ����
		Message message = (Message)arg;

		System.out.println(message.getTitle());
		System.out.println(message.getContext());
	}

}
