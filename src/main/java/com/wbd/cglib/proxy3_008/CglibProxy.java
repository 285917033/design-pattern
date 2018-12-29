package com.wbd.cglib.proxy3_008;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
/**
 * Cglib���������
 * ��Data���ڴ��ж�̬����һ���������
 */
public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public CglibProxy(Object target) {
		this.target = target;
	}
	
	
	//��Ŀ����󴴽�һ���������
	
	public Object getProxyInstance() {
		
		
		 //1.������
        Enhancer en = new Enhancer();
        //2.���ø���
        en.setSuperclass(target.getClass());
        
        //3.���ûص�����
        en.setCallback(this);
        //4.��������(�������)
        return en.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		this.dazhe();
		Object o = arg1.invoke(target, arg2);
		this.give();
		return o;
	}

	
	public void dazhe() {
		System.out.println("����~~~~~~~~~");
	}

	public void give() {
		System.out.println("���ʹ���ȯ~~~~~~~~~");
	}
}
