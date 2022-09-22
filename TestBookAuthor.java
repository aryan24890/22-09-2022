package com.InheritanceInterface.pll;

import com.InheritanceInterface.bll.Author;
import com.InheritanceInterface.bll.Book;

public class TestBookAuthor {

	public static void main(String[] args) {
		Author a1 = new Author("Aryan","aryan.gmail.com");
		
		System.out.println("Author ["+a1.toString()+"]");
		Book b1 = new Book("101-205-930","Java World",a1,305.2);
		System.out.println(b1);

	}

}
