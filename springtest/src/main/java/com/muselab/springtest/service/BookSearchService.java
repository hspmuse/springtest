package com.muselab.springtest.service;

import com.muselab.springtest.vo.BookListResultVO;

public interface BookSearchService {
	
	public BookListResultVO[] getSearchBookList(String srh_str) throws Exception;

}
