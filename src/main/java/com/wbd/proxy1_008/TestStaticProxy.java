package com.wbd.proxy1_008;

/**
 * 代理模式：
 * 1.静态代理 
 * 2.动态代理：
 *  1）jdk实现（1.实现InvocationHandler，2，不实现任何接口，这种方式其实是对实现InvocationHandler接口的一种升级或者简化），
 *  2）CGLIB实现
 * 
 * 在Spring的AOP编程中: 
 * 如果加入容器的目标对象有实现接口, 用JDK代理 
 * 如果目标对象没有实现接口,用Cglib代理
 * 
 * @author jwh
 *
 */
public class TestStaticProxy {

	public static void main(String[] args) {
		
		//目标对象
		UserDAOImpl udi = new UserDAOImpl();
		
		//代理对象
		UserDaoProxy udp = new UserDaoProxy(udi);
		
		//执行的是代理对象的方法，代理对象方法再调用目标对象方法
		udp.save();

	}

}
