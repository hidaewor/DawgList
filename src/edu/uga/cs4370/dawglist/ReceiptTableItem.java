package edu.uga.cs4370.dawglist;

public class ReceiptTableItem {
	private String orderTime;
	private int orderID, customerID, sellerID, itemID;
	
	public int getOrderID(){
		return orderID;
	}
	public void setOrderID(int orderID){
		this.orderID = orderID;
	}
	
	public int getItemID(){
		return itemID;
	}
	public void setItemID(int itemID){
		this.itemID = itemID;
	}
	
	public int getSellerID(){
		return sellerID;
	}
	public void setSellerID(int sellerID){
		this.sellerID = sellerID;
	}
	
	public int getCustomerID(){
		return customerID;
	}
	public void setCustomerID(int customerID){
		this.customerID = customerID;
	}
	
	public String getOrderTime(){
		return orderTime;
	}
	public void setOrderTime(String orderTime){
		this.orderTime = orderTime;
	}

}