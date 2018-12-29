package com.wbd.proxy2_008;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 另外一种jdk实现动态代理方式， 不需要实现任何接口,
 * 动态代理不需要实现接口,但是需要指定接口类型
 * 这种方式其实是对 实现InvocationHandler接口的一种升级或者简化。
 * @author jwh
 *
 */
public class JDKProxyFactory {

	//维护一个目标对象
	private Object object;

	public JDKProxyFactory(Object object) {

		this.object = object;
	}
	
	//给目标对象生成一个代理对象
	
	public Object getProxyInstance() {
		
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
				new InvocationHandler() { //匿名内部类
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				dazhe();
				Object o = method.invoke(object, args);
				give();
				return o;
			}
		});
	}
	
	
	public void dazhe() {
		System.out.println("打折咯");
	}

	public void give() {
		System.out.println("赠送代金券咯");
	}
}
