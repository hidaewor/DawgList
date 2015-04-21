package edu.uga.cs4370.dawglist;

public class TableItem {
	private String id, sellerName, category, price, itemCondition, description;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getSellerName(){
		return sellerName;
	}
	public void setSellerName(String sellerName){
		this.sellerName = sellerName;
	}

	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
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
