package com.wbd.method.factory_001;
/**
 * 2.��������ģʽ
 * @author jwh
 *
 */
public class TestMethodFactory {

	public static void main(String[] args) {
		
		AppleFactory af = new AppleFactory();
		
		Fruit apple =  af.getFruit();
		
		apple.get();
		
		BananaFactory bf = new BananaFactory();
		
		Fruit banana =  bf.getFruit();
		
		banana.get();

	}

}
