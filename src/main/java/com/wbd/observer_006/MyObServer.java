package com.wbd.observer_006;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者模式：
 * 1.观察者必须 实现Observer接口
 * 2.被观察者必须继承Observable该类
 * 3.观察者必须注册到 被观察者中
 * @author jwh
 *
 */
public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
		
		System.out.println("change.....");

	}

}
