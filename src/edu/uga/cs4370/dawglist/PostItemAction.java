package edu.uga.cs4370.dawglist;

import java.sql.*;

public class PostItemAction {
	
	private String sellerName, sellerEmail, itemName, category, itemCondition, description;
	private int sellerID, price, itemID;
	
	public String execute(){
		String ret = null;
		try{
			itemID = (int)(100000 + Math.random() * 900000);
			
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("insert into itemdb values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, itemID);
			ps.setInt(2, sellerID);
			ps.setString(3, sellerName);
			ps.setString(4, sellerEmail);
			ps.setString(5, itemName);
			ps.setString(6, category);
			ps.setInt(7, price);
			ps.setString(8, itemCondition);
			ps.setString(9, description);
			ps.executeUpdate();
			ret = "success";
			
		} 
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
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
