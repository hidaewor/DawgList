package edu.uga.cs4370.dawglist;

public class TableItem {
	private String sellerName, sellerEmail, itemName, category, itemCondition, description;
	private int sellerID, price, itemID;
	
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

	public String getSellerName(){
		return sellerName;
	}
	public void setSellerName(String sellerName){
		this.sellerName = sellerName;
	}
	
	public String getSellerEmail(){
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail){
		this.sellerEmail = sellerEmail;
	}
	
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public String getItemCondition(){
		return itemCondition;
	}
	public void setItemCondition(String itemCondition){
		this.itemCondition = itemCondition;
	}
	
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description = description;
	}
}
