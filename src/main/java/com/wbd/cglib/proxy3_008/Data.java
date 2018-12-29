package com.wbd.cglib.proxy3_008;
/**
 * CGLIB动态代理，在内存中产生目标对象的子类为代理对象，实现目标对象的代理对象
 * 1.目标对象不实现任何接口
 * 2.Cglib子类代理工厂类必须实现MethodInterceptor接口
 * @author jwh
 *
 */
public class Data {

	public void saveDate() {
		System.out.println("保存数据");
	}
}
