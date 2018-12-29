package com.wbd.proxy2_008;


/**
 * 动态代理 ，jdk实现方式之一，实现InvocationHandler接口
 * 总结:
代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
动态代理都是通过在内存中构建代理对象
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHanlder implements InvocationHandler {

	private IUserDAO userDAO;

	public MyHanlder(IUserDAO userDAO) {

		this.userDAO = userDAO;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		this.dazhe();
		Object o = method.invoke(userDAO, args);
		this.give();

		return o;
	}

	public void dazhe() {
		System.out.println("打折.....");
	}

	public void give() {
		System.out.println("赠送代金券...");
	}
}
