package com.wbd.proxy2_008;

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
public class TestJDKDyniamicProxy2 {

	public static void main(String[] args) {
		
		//Ŀ�����
		IUserDAO dao = new UserDAOImpl();
		
		JDKProxyFactory jpf = new JDKProxyFactory(dao);
		//���ش������
		IUserDAO dao2 = (IUserDAO) jpf.getProxyInstance();
		
		//ִ�д�����
		dao2.save();
				
	}

}
