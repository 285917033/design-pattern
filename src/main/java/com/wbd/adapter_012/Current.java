package com.wbd.adapter_012;

/**
 * 适配器模式， 
 * 适配器就是一种适配中间件，它存在于不匹配的二者之间，用于连接二者，将不匹配变得匹配，
 * 简单点理解就是平常所见的转接头，转换器之类的存在。
　　适配器模式有两种：类适配器(通过继承)、对象适配器（通过引用或者组合方式）、接口适配器

　　前二者在实现上有些许区别，作用一样，第三个接口适配器差别较大。
 * @author jwh
 * 
 * 将220V 转换为18V的笔记本电脑电压
 *
 */
public class Current {
	
	public void use220V() {
		
		System.out.println("采用的是220V");
	}

}
