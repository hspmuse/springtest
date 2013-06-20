package com.muselab.search;

import com.muselab.search.service.BookSearchService;
import com.muselab.search.vo.BookListResultVO;

public class BookSearchMain {
	
	private static BookSearchService bookSearchService;
	
	static void main(String[] arg) {
		
		BookListResultVO[] bookList = null;
		
		String srh = "ㅇㄴ";
		
		try {
			System.out.println("--------" );
			bookList = bookSearchService.getSearchBookList(srh);
			
			System.out.println("aaaaaaaaaaa" + bookList.length);
			
		} catch ( Exception e) {
			
		}
		
		//return bookList;
		
	}
}
