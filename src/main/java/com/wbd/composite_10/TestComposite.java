package com.wbd.composite_10;

public class TestComposite {

	public static void main(String[] args) {
		IFile f1,f2,f3,f4,folder1,folder2,folder3,folder4;
		
		folder1= new Folder("java�ļ���");
		folder2= new Folder("ͼƬ�ļ���");
		folder3= new Folder("�ı��ļ���");
		folder4= new Folder("��Ƶ�ļ���");
		
		f1 = new ImageFile("a.jpg");
		f2 = new TextFile("b.txt");
		f3 = new TextFile("c.doc");
		f4 = new VieoFile("d.rmvb");

		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);
		
		folder2.add(f1);
		
		folder3.add(f2);
		folder3.add(f3);
		
		folder4.add(f4);
		
		f4.killVirus();
		
		
	}

}
