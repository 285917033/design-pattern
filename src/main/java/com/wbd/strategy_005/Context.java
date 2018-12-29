package com.wbd.strategy_005;
/**
 * ��ͻ��ṩ����,
 * 1.���г���ӿ� ������
 * 2.�ṩһ�� ���ӿڲ����Ĺ�����
 * 3.�ṩһ�������� �÷�������ʵ���ǵ��� ��������(�ӿ�����)�ķ���
 * @author jwh
 *
 */
public class Context {
	
	private Strategy strategy;
	
	
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void encrypt() {
		this.strategy.encrypt();
	}

}
