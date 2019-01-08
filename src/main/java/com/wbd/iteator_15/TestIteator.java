package com.wbd.iteator_15;

import java.util.Iterator;
import java.util.List;

public class TestIteator {

	public static void main(String[] args) {
	
		Book  book1 = new Book("11","java编程思想",100);
		Book  book2 = new Book("12","设计模式",120);
		
		BookList  list = new BookList();
		
		
		
		list.addBook(book1);
		list.addBook(book2);

//		
//		while(list.hasNext()) {
//			Book  book3=	list.getNext();
//		   // book3.display();
//		}
//		
//		List<Book>  list2 =   list.getBookList();
//	
//		for (Book book : list2) {
//			//book.display();
//		}
//		
//		Iterator<Book> it = list.getBookList().iterator();
//		
//		while(it.hasNext()) {
//			Book b = it.next();
//			b.display();
//		}
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book b = it.next();
			b.display();
		}
	}

}
