package com.wbd.iteator_15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	
	private int index;
	
	private List<Book> bookList;
	
	
	
	public BookList() {
		bookList  = new ArrayList<Book>();
	}

	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public void deleteBook(Book book) {
		
		int bookIndex= bookList.indexOf(book);
		
		bookList.remove(bookIndex);
	}
	
	public boolean hasNext() {
		
		if(index>=bookList.size()) {
			
			return false;
		}
		
		return true;
	}
	
	public Book getNext() {
		return bookList.get(index++);
	}
	
	public List<Book> getBookList(){
		
		return bookList;
	}
	
	
	public Iterator<Book> iterator() {
		return new Itr();
	}
	
	//内部类，内部类的方法可以返回外部类的属性
	private class Itr implements Iterator<Book>{

		public boolean hasNext() {
			
			if(index>=bookList.size()) {
				
				return false;
			}
			
			return true;
		}

		public Book next() {
			return bookList.get(index++);
		}
		
	}
}
