package com.wbd.builder_003.copy;
/**
 * 抽象建造者：装修工人
 * @author jwh
 *
 */
public abstract  class Decorator {

	protected Parlour product = new Parlour();

    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    public abstract void buildLamp();
    
    public Parlour getResult() {
    	
    	return product;
    }
}

