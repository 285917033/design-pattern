package com.wbd.cglib.proxy3_008;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
/**
 * Cglib子类代理工厂
 * 对Data在内存中动态构建一个子类对象
 */
public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public CglibProxy(Object target) {
		this.target = target;
	}
	
	
	//给目标对象创建一个代理对象
	
	public Object getProxyInstance() {
		
		
		 //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		this.dazhe();
		Object o = arg1.invoke(target, arg2);
		this.give();
		return o;
	}

	
	public void dazhe() {
		System.out.println("打折~~~~~~~~~");
	}

	public void give() {
		System.out.println("赠送代金券~~~~~~~~~");
	}
}
