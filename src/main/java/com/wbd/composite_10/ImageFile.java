package com.wbd.composite_10;

/**
 * ͼ���ļ���Ҷ�ӽڵ�
 * @author jwh
 *
 */
public class ImageFile implements IFile {

	private String name;
	
	
	public ImageFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("�Բ���ImageFile-add��֧�ָ÷�����");  
	}

	public void remove(IFile file) {
		 System.out.println("�Բ���ImageFile-remove��֧�ָ÷�����");  

	}

	public IFile getChild(int i) {
		 System.out.println("�Բ���ImageFile-getChild��֧�ָ÷�����");  

		return null;
	}

	public void killVirus() {
		 System.out.println("��ͼƬ�ļ�"+name+"����ɱ��");  

	}

}
