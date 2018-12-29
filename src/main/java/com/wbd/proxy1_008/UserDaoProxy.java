package com.wbd.proxy1_008;

/**
 * 代理对象， 与目标对象实现同一个接口， 但是代理对象的方法实现就是调用目标对象的方法
 * 代理对象可以扩展方法，比如调用目标save方法之后，可以调用其他的方法， 发邮件提醒或者短信提醒等等
 * ，代理对象是对目标对象功能的扩展，但是不会影响目标对象。
 * @author jwh
 *
 */
public class UserDaoProxy implements IUserDAO {
	
	private IUserDAO userDAO;
	
	public UserDaoProxy(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * 代理方法中，可以进行扩展，但是必须要调用目标对象的方法
	 */
	public void save() {
	
		System.out.println("开启事物");
		userDAO.save();
		System.out.println("关闭事物");
		this.sendMessage();

	}
	
	
	public void sendMessage() {
		System.out.println("发送信息，用户保存成功");
	}

}
