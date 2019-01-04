package com.wbd.composite_10;

/**
 * �ı��ļ���Ҷ�ӽڵ�
 * @author jwh
 *
 */
public class TextFile implements IFile {

	private String name;
	
	
	public TextFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("�Բ���TextFile-add��֧�ָ÷�����");  
	}

	public void remove(IFile file) {
		 System.out.println("�Բ���TextFile-remove��֧�ָ÷�����");  

	}

	public IFile getChild(int i) {
		 System.out.println("�Բ���TextFile-getChild��֧�ָ÷�����");  

		return null;
	}

	public void killVirus() {
		 System.out.println("���ļ��ļ�"+name+"����ɱ��");  

	}

}
