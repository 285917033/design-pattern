package com.wbd.proxy1_008;

/**
 * ������� ��Ŀ�����ʵ��ͬһ���ӿڣ� ���Ǵ������ķ���ʵ�־��ǵ���Ŀ�����ķ���
 * ������������չ�������������Ŀ��save����֮�󣬿��Ե��������ķ����� ���ʼ����ѻ��߶������ѵȵ�
 * ����������Ƕ�Ŀ������ܵ���չ�����ǲ���Ӱ��Ŀ�����
 * @author jwh
 *
 */
public class UserDaoProxy implements IUserDAO {
	
	private IUserDAO userDAO;
	
	public UserDaoProxy(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * �������У����Խ�����չ�����Ǳ���Ҫ����Ŀ�����ķ���
	 */
	public void save() {
	
		System.out.println("��������");
		userDAO.save();
		System.out.println("�ر�����");
		this.sendMessage();

	}
	
	
	public void sendMessage() {
		System.out.println("������Ϣ���û�����ɹ�");
	}

}
