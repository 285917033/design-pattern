package com.zgh.design.pattern.builder;
/**
 * 具体的建造者(服务员)
 * @author zgh
 *
 */
public class ConcreteBuilder implements Builder {
	
	
	public ConcreteBuilder() {
		product = new Product();
	}
	
	private Product product;

	public Builder builderA(String mes) {
	 product.setBuildA(mes);
		return this;
	}

	public Builder builderB(String mes) {
		
		product.setBuildB(mes);
		return this;
	}

	public Builder builderC(String mes) {
		product.setBuildC(mes);
		return this;
	}

	public Builder builderD(String mes) {
		product.setBuildD(mes);
		return this;
	}

	public Product build() {
		return product;
	}

}
