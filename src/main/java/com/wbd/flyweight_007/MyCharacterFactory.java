package com.wbd.flyweight_007;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
	
	private Map<Character,MyCharacter> pool;
	
	public MyCharacterFactory(){
		pool = new HashMap<Character,MyCharacter>();
	}
	
	public MyCharacter getMyCharacter(Character character) {
		
		 MyCharacter c = pool.get(character);
		 
		 if(c==null) {
			 
			 c = new MyCharacter(character);
			 pool.put(character, c);
		 }
		 
		 
		 return c;
	}

}
