package com.wbd.proxy2_008;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ����һ��jdkʵ�ֶ�̬����ʽ�� ����Ҫʵ���κνӿ�,
 * ��̬������Ҫʵ�ֽӿ�,������Ҫָ���ӿ�����
 * ���ַ�ʽ��ʵ�Ƕ� ʵ��InvocationHandler�ӿڵ�һ���������߼򻯡�
 * @author jwh
 *
 */
public class JDKProxyFactory {

	//ά��һ��Ŀ�����
	private Object object;

	public JDKProxyFactory(Object object) {

		this.object = object;
	}
	
	//��Ŀ���������һ���������
	
	public Object getProxyInstance() {
		
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
				new InvocationHandler() { //�����ڲ���
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				dazhe();
				Object o = method.invoke(object, args);
				give();
				return o;
			}
		});
	}
	
	
	public void dazhe() {
		System.out.println("���ۿ�");
	}

	public void give() {
		System.out.println("���ʹ���ȯ��");
	}
}
