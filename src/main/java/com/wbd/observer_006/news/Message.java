package com.wbd.observer_006.news;
/**
 * 消息：
 * 用户发送消息，客户进行接受消息，其实 mq的原理就是采用观察者模式实现的
 * @author jwh
 *
 */
public class Message {
	
	
	private String title;
	
	private String context;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Message(String title, String context) {
		super();
		this.title = title;
		this.context = context;
	}

	
	
	
	

}
