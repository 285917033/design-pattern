package com.wbd.composite_10;

public class TestComposite {

	public static void main(String[] args) {
		IFile f1,f2,f3,f4,folder1,folder2,folder3,folder4;
		
		folder1= new Folder("java文件夹");
		folder2= new Folder("图片文件夹");
		folder3= new Folder("文本文件夹");
		folder4= new Folder("视频文件夹");
		
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
