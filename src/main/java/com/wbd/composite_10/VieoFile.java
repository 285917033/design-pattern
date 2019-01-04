package com.wbd.composite_10;

/**
 * ��Ƶ�ļ���Ҷ�ӽڵ�
 * @author jwh
 *
 */
public class VieoFile implements IFile {

	private String name;
	
	
	public VieoFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("�Բ���VieoFile-add��֧�ָ÷�����");  
	}

	public void remove(IFile file) {
		 System.out.println("�Բ���VieoFile-remove��֧�ָ÷�����");  

	}

	public IFile getChild(int i) {
		 System.out.println("�Բ���VieoFile-getChild��֧�ָ÷�����");  

		return null;
	}

	public void killVirus() {
		 System.out.println("����Ƶ�ļ�"+name+"����ɱ��");  

	}

}
