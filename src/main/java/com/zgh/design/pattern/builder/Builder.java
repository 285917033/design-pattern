package com.zgh.design.pattern.builder;
/**
 * ������
 * @author zgh
 *
 */
public interface Builder {

	Builder builderA(String mes);
	Builder builderB(String mes);
	Builder builderC(String mes);
	Builder builderD(String mes);
	
	Product build();
}
