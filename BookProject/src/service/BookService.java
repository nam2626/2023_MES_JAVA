package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.BookVO;

public class BookService {
	private static BookService instance = new BookService();
	
	private ArrayList<BookVO> list; 
		
	private BookService() {
		list = new ArrayList<BookVO>();
	}

	public static BookService getInstance() {
		if(instance == null)
			instance = new BookService();
		return instance;
	}


	
}











