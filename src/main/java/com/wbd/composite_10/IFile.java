package com.wbd.composite_10;
/**
 * 组合模式,利用递归，
 * 使用场景：1.文件夹与文件 系统，2，公司与部门 3.文件扫描或者杀毒，
 * @author jwh
 * 
 * 抽象文件类，抽象接口
 *
 */
public interface IFile {
	
	public void add(IFile file);
	
	public void remove(IFile file);

	public IFile getChild(int i);
	
	//文件杀毒
	public void killVirus();
}
