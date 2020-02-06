package com.zgh.design.pattern.decorator;

public class T {
	
	  static void print(Coffee c) {
	        System.out.println("花费了: " + c.getCost());
	        System.out.println("配料: " + c.getIngredients());
	        System.out.println("============");
	    }
	
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
    	   //print(c);
	   
		 c = new WithMilk(c);
		   print(c);
		   
		   c  = new WithSugar(c);
		   print(c);
	}

}
