package com.wbd.observer_006;

import java.util.Observable;
import java.util.Observer;
/**
 * �۲���ģʽ��
 * 1.�۲��߱��� ʵ��Observer�ӿ�
 * 2.���۲��߱���̳�Observable����
 * 3.�۲��߱���ע�ᵽ ���۲�����
 * @author jwh
 *
 */
public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
		
		System.out.println("change.....");

	}

}
