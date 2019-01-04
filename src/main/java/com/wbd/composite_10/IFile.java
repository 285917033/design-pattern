package com.wbd.composite_10;
/**
 * ���ģʽ,���õݹ飬
 * ʹ�ó�����1.�ļ������ļ� ϵͳ��2����˾�벿�� 3.�ļ�ɨ�����ɱ����
 * @author jwh
 * 
 * �����ļ��࣬����ӿ�
 *
 */
public interface IFile {
	
	public void add(IFile file);
	
	public void remove(IFile file);

	public IFile getChild(int i);
	
	//�ļ�ɱ��
	public void killVirus();
}
