package com.muselab.springtest.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.muselab.springtest.service.BookSearchService;
import com.muselab.springtest.vo.BookListResultVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BookSearchController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookSearchController.class);

	@Resource(name="bookSearchService")
	private BookSearchService bookSearchService;

	public BookListResultVO[] getSearchBook(String srh) {
		//logger.debug("Welcome home! The client locale is {}." + srh);
		System.out.println("---srh----" + srh);
		
		BookListResultVO[] bookList = null;
		
		try {
			System.out.println("--------" );
			bookList = bookSearchService.getSearchBookList(srh);
			
			logger.debug("aaaaaaaaaaa" + bookList.length);
			
		} catch ( Exception e) {
			
		}
		
		return bookList;
	}
	
}
