package com.muselab.search.service;

import com.muselab.search.vo.BookListResultVO;

public interface BookSearchService {
	public BookListResultVO[] getSearchBookList(String srh_str) throws Exception;
}
