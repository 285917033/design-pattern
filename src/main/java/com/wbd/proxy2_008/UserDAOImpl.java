package com.wbd.proxy2_008;

/**
 * 目标对象(代理对象正在执行的是目标对象的方法)
 * @author jwh
 *
 */
public class UserDAOImpl implements IUserDAO {

	public void save() {
		System.out.println("我是目标对象，保存数据");

	}

}
