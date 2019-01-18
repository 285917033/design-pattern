package com.wbd.builder_003.copy;

public class ProjectManager {
	
	private Decorator builder;
	
	public ProjectManager(Decorator builder) {
		
		this.builder = builder;
	}
	
	//��Ʒ��������װ����
	
	public Parlour decorate() {
		builder.buildWall();
		builder.buildSofa();
		builder.buildTV();
		builder.buildLamp();
		return builder.getResult();
	}

}
