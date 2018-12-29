package com.wbd.proxy2_008;


/**
 * ��̬���� ��jdkʵ�ַ�ʽ֮һ��ʵ��InvocationHandler�ӿ�
 * �ܽ�:
���������Ҫʵ�ֽӿ�,����Ŀ�����һ��Ҫʵ�ֽӿ�,�������ö�̬����
��̬������ͨ�����ڴ��й����������
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
		System.out.println("����.....");
	}

	public void give() {
		System.out.println("���ʹ���ȯ...");
	}
}
