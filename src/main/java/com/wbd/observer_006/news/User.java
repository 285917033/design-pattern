package com.wbd.observer_006.news;

import java.util.Observable;

/**
 * 被观察者,必须继承observable,
 * @author jwh
 *
 */
public class User extends Observable{
	
	public void publishMessage(Message message) {
		
		System.out.println("发送消息..");
		
		this.setChanged();
		//被观察者吧消息发送出去，观察者 可以通过update获取到该消息对象
		this.notifyObservers(message);
	}

}
