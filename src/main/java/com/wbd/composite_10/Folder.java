package com.wbd.composite_10;

import java.util.ArrayList;

/**
 * 文件夹，非叶子节点
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
		 System.out.println("对文件夹"+name+"进行杀毒");  

		 //递归调用成员的killVirus方法
		 for(IFile f:fileList) {
			 f.killVirus();
		 }
	}

}
