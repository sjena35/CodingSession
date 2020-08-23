package com.day_1;

public class Order {
	
	int orderid;
	String ordername;
	float price;
	int qtyOrdered;
	public Order(int orderid, String ordername, float price, int qtyOrdered) {

		this.orderid = orderid;
		this.ordername = ordername;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordername=" + ordername + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}
	
	
	
	
	
	

}
