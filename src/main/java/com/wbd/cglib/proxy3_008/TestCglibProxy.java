package com.wbd.cglib.proxy3_008;

/**
 * ��̬����Ͷ�̬����ģʽ����Ҫ��Ŀ�������ʵ��һ���ӿڵ�Ŀ�����,������ʱ��Ŀ�����ֻ��һ�������Ķ���,
 * ��û��ʵ���κεĽӿ�,���ʱ��Ϳ���ʹ����Ŀ���������ķ�ʽ��ʵ�ִ���,���ַ����ͽ���:Cglib����
 * ��̬�������ڴ��ж�̬�����������
 * Cglib����,Ҳ�����������,�������ڴ��й���һ���������Ӷ�ʵ�ֶ�Ŀ������ܵ���չ.
 * 
 * JDK�Ķ�̬������һ������,����ʹ�ö�̬����Ķ������ʵ��һ�������ӿ�,��������û��ʵ�ֽӿڵ���,�Ϳ���ʹ��Cglibʵ��.
 * Cglib��һ��ǿ��ĸ����ܵĴ������ɰ�,����������������չjava����ʵ��java�ӿ�.���㷺�ı����AOP�Ŀ��ʹ��,
 * ����Spring AOP��synaop,Ϊ�����ṩ������interception(����)
 * 
 * @author jwh
 *Cglib�������ʵ�ַ���:
1.��Ҫ����cglib��jar�ļ�,����Spring�ĺ��İ����Ѿ�������Cglib����,����ֱ������pring-core-3.2.5.jar����.
2.���빦�ܰ���,�Ϳ������ڴ��ж�̬��������
3.������಻��Ϊfinal,���򱨴�
4.Ŀ�����ķ������Ϊfinal/static,��ô�Ͳ��ᱻ����,������ִ��Ŀ���������ҵ�񷽷�.
 *
 */
public class TestCglibProxy {

	public static void main(String[] args) {
		Data target = new Data();
		CglibProxy cp = new CglibProxy(target);
		
		Data proxy = (Data) cp.getProxyInstance();
		
		proxy.saveDate();
		
	}

}
