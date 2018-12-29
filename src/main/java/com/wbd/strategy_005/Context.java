package com.wbd.strategy_005;
/**
 * 向客户提供的类,
 * 1.持有抽象接口 的引用
 * 2.提供一个 带接口参数的构造器
 * 3.提供一个方法， 该方法具体实现是调用 该类属性(接口引用)的方法
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
