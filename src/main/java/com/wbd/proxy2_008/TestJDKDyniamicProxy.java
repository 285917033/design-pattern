package com.wbd.proxy2_008;

import java.lang.reflect.Proxy;

/**
 * 代理模式：
 * 1.静态代理 
 * 2.动态代理： 1）jdk实现，2）CGLIB实现
 * 
 * 在Spring的AOP编程中: 
 * 如果加入容器的目标对象有实现接口, 用JDK代理 
 * 如果目标对象没有实现接口,用Cglib代理
 * 
 * @author jwh
 *
 *动态代理 ，jdk实现方式
 *总结:
代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class TestJDKDyniamicProxy {

	public static void main(String[] args) {
		
		//目标对象
		IUserDAO dao = new 	UserDAOImpl();
		
		MyHanlder  m = new MyHanlder(dao);
		
		//代理对象
		IUserDAO dao2 = (IUserDAO) Proxy.newProxyInstance(UserDAOImpl.class.getClassLoader(), UserDAOImpl.class.getInterfaces(), m);
		IUserDAO dao3 = (IUserDAO) Proxy.newProxyInstance(UserDAOImpl.class.getClassLoader(), UserDAOImpl.class.getInterfaces(), m);
		
		System.out.println(dao2==dao3);
		dao2.save();
		
	}

}
