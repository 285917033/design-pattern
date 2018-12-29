package com.wbd.observer_006.news;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者必须实现Observer接口
 * @author jwh
 *
 */
public class MyObserver implements Observer {

	public void update(Observable o, Object arg) {
		//接收被观察者发出的信息对象
		Message message = (Message)arg;

		System.out.println(message.getTitle());
		System.out.println(message.getContext());
	}

}
