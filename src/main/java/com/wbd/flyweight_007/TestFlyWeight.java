package com.wbd.flyweight_007;

public class TestFlyWeight {

	public static void main(String[] args) {
		
		MyCharacter mc = new MyCharacter('a');
		MyCharacter mc2 = new MyCharacter('b');
		MyCharacter mc3 = new MyCharacter('a');
		MyCharacter mc4 = new MyCharacter('c');
		
		System.out.println(mc==mc3);
		
		MyCharacterFactory mf = new MyCharacterFactory();
		
		MyCharacter m = mf.getMyCharacter('a');
		MyCharacter m2 = mf.getMyCharacter('b');
		MyCharacter m3 = mf.getMyCharacter('a');
		
		System.out.println(m==m3);

	}

}
