package com.wbd.composite_10;

import java.util.ArrayList;

/**
 * �ļ��У���Ҷ�ӽڵ�
 * @author jwh
 *
 */
public class Folder implements IFile {
	
	private ArrayList<IFile> fileList = new ArrayList<IFile>();

	private String name;
	
	
	public Folder(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		fileList.add(file);
	}

	public void remove(IFile file) {
		fileList.remove(file);
	}

	public IFile getChild(int i) {
		return fileList.get(i);
	}

	public void killVirus() {
		 System.out.println("���ļ���"+name+"����ɱ��");  

		 //�ݹ���ó�Ա��killVirus����
		 for(IFile f:fileList) {
			 f.killVirus();
		 }
	}

}
