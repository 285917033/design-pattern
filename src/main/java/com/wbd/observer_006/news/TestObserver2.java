package com.wbd.observer_006.news;
public class TestObserver2 {
	public static void main(String[] args) {
		User user = new User();
		user.addObserver(new MyObserver());
		user.publishMessage(new Message("ÖĞ¹ú","Ïã¸Û"));
	}

}
