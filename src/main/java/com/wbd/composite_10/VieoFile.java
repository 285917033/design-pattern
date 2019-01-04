package com.wbd.composite_10;

/**
 * 视频文件，叶子节点
 * @author jwh
 *
 */
public class VieoFile implements IFile {

	private String name;
	
	
	public VieoFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("对不起，VieoFile-add不支持该方法！");  
	}

	public void remove(IFile file) {
		 System.out.println("对不起，VieoFile-remove不支持该方法！");  

	}

	public IFile getChild(int i) {
		 System.out.println("对不起，VieoFile-getChild不支持该方法！");  

		return null;
	}

	public void killVirus() {
		 System.out.println("对视频文件"+name+"进行杀毒");  

	}

}
