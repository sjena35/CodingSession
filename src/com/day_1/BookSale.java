package com.day_1;

public class BookSale {
	Book b;
	int copiesSold;
	public BookSale(Book b, int copiesSold) {

		this.b = b;
		this.copiesSold = copiesSold;
	}
	@Override
	public String toString() {
		return "BookSale [b=" + b + ", copiesSold=" + copiesSold + "]";
	}
	
	
	
	

}
