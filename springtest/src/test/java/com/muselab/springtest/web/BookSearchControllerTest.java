package com.muselab.springtest.web;

import static org.junit.Assert.*;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;

import com.muselab.springtest.vo.BookListResultVO;


public class BookSearchControllerTest extends TestCase {

	private static final Logger logger = LoggerFactory.getLogger(BookSearchControllerTest.class);
	
	@Autowired
	private BookSearchController bookController = null;
	
	@Override
	protected void setUp() throws Exception {
		
		bookController = new BookSearchController();
		logger.debug("setup");
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		BookListResultVO[] bookList = null;
		
		//System.out.println("------------");		
		String srh = "ㅈㄱ";
		//homeCon.home(locale, model);
		bookList = bookController.getSearchBook(srh);
		
		for(int i=0; i<bookList.length; i++) {
			
			logger.debug(bookList[i].getBook_nm());
		}
		

	}

}
