package com.wbd.composite_10;

/**
 * 图像文件，叶子节点
 * @author jwh
 *
 */
public class ImageFile implements IFile {

	private String name;
	
	
	public ImageFile(String name) {
		this.name = name;
	}

	public void add(IFile file) {
		 System.out.println("对不起，ImageFile-add不支持该方法！");  
	}

	public void remove(IFile file) {
		 System.out.println("对不起，ImageFile-remove不支持该方法！");  

	}

	public IFile getChild(int i) {
		 System.out.println("对不起，ImageFile-getChild不支持该方法！");  

		return null;
	}

	public void killVirus() {
		 System.out.println("对图片文件"+name+"进行杀毒");  

	}

}
