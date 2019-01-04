package com.wbd.composite_10;

/**
 * 文本文件，叶子节点
 * @author jwh
 *
 */
public class TextFile implements IFile {

	private String name;
	
	
	public TextFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("对不起，TextFile-add不支持该方法！");  
	}

	public void remove(IFile file) {
		 System.out.println("对不起，TextFile-remove不支持该方法！");  

	}

	public IFile getChild(int i) {
		 System.out.println("对不起，TextFile-getChild不支持该方法！");  

		return null;
	}

	public void killVirus() {
		 System.out.println("对文件文件"+name+"进行杀毒");  

	}

}
