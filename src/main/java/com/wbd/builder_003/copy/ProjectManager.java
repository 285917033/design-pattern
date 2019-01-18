package com.wbd.builder_003.copy;

public class ProjectManager {
	
	private Decorator builder;
	
	public ProjectManager(Decorator builder) {
		
		this.builder = builder;
	}
	
	//产品构建与组装方法
	
	public Parlour decorate() {
		builder.buildWall();
		builder.buildSofa();
		builder.buildTV();
		builder.buildLamp();
		return builder.getResult();
	}

}
