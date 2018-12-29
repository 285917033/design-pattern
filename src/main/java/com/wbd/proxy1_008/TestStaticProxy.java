package com.wbd.proxy1_008;

/**
 * ����ģʽ��
 * 1.��̬���� 
 * 2.��̬����
 *  1��jdkʵ�֣�1.ʵ��InvocationHandler��2����ʵ���κνӿڣ����ַ�ʽ��ʵ�Ƕ�ʵ��InvocationHandler�ӿڵ�һ���������߼򻯣���
 *  2��CGLIBʵ��
 * 
 * ��Spring��AOP�����: 
 * �������������Ŀ�������ʵ�ֽӿ�, ��JDK���� 
 * ���Ŀ�����û��ʵ�ֽӿ�,��Cglib����
 * 
 * @author jwh
 *
 */
public class TestStaticProxy {

	public static void main(String[] args) {
		
		//Ŀ�����
		UserDAOImpl udi = new UserDAOImpl();
		
		//�������
		UserDaoProxy udp = new UserDaoProxy(udi);
		
		//ִ�е��Ǵ������ķ�����������󷽷��ٵ���Ŀ����󷽷�
		udp.save();

	}

}
