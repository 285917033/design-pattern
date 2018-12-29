package com.wbd.flyweight_007;

/**
 * 享元模式，核心是减少对象内存的占用，
 * 
 *  Flyweight模式也叫享元模式，是构造型模式之
一，它通过与其他类似对象共享数据来减小内存
占用。
 * @author jwh
 *
 */
public class MyCharacter {
	
	private char mychar;
	
	
	public MyCharacter(char mychar) {
		this.mychar = mychar;
	}

	
	public void display() {
		
		System.out.println("mychar="+mychar);
		
	}
	
}
