package com.muselab.springtest.vo;

import java.io.Serializable;

public class BookListResultVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String book_no;
	private String book_nm;
	private String book_cost;
	private String book_sale_cnt;
	
	public String getBook_no() {
		return book_no;
	}
	public void setBook_no(String book_no) {
		this.book_no = book_no;
	}
	public String getBook_nm() {
		return book_nm;
	}
	public void setBook_nm(String book_nm) {
		this.book_nm = book_nm;
	}
	public String getBook_cost() {
		return book_cost;
	}
	public void setBook_cost(String book_cost) {
		this.book_cost = book_cost;
	}
	public String getBook_sale_cnt() {
		return book_sale_cnt;
	}
	public void setBook_sale_cnt(String book_sale_cnt) {
		this.book_sale_cnt = book_sale_cnt;
	}

}
