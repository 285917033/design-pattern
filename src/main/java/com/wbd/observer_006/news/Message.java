package com.wbd.observer_006.news;
/**
 * ��Ϣ��
 * �û�������Ϣ���ͻ����н�����Ϣ����ʵ mq��ԭ����ǲ��ù۲���ģʽʵ�ֵ�
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
