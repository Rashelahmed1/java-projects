package com.lq.lab15;

public class Item {

	private String title;
	private double price;
	private int qty;
	
	public Item(String title,double price,int qty) {
		setTitle(title); // this.title = title;
		setPrice(price);
		setQty(qty);
		
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	





}
