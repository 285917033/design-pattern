package com.wbd.proxy2_008;

import java.lang.reflect.Proxy;

/**
 * ����ģʽ��
 * 1.��̬���� 
 * 2.��̬���� 1��jdkʵ�֣�2��CGLIBʵ��
 * 
 * ��Spring��AOP�����: 
 * �������������Ŀ�������ʵ�ֽӿ�, ��JDK���� 
 * ���Ŀ�����û��ʵ�ֽӿ�,��Cglib����
 * 
 * @author jwh
 *
 *��̬���� ��jdkʵ�ַ�ʽ
 *�ܽ�:
���������Ҫʵ�ֽӿ�,����Ŀ�����һ��Ҫʵ�ֽӿ�,�������ö�̬����
 */
public class TestJDKDyniamicProxy {

	public static void main(String[] args) {
		
		//Ŀ�����
		IUserDAO dao = new 	UserDAOImpl();
		
		MyHanlder  m = new MyHanlder(dao);
		
		//�������
		IUserDAO dao2 = (IUserDAO) Proxy.newProxyInstance(UserDAOImpl.class.getClassLoader(), UserDAOImpl.class.getInterfaces(), m);
		IUserDAO dao3 = (IUserDAO) Proxy.newProxyInstance(UserDAOImpl.class.getClassLoader(), UserDAOImpl.class.getInterfaces(), m);
		
		System.out.println(dao2==dao3);
		dao2.save();
		
	}

}
