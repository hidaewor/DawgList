package edu.uga.cs4370.dawglist;

import java.sql.*;

public class PostItemAction {
	
	private String id, sellerName, category, price, itemCondition, description;
	
	public String execute(){
		String ret = null;
		try{
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("insert into itemdb values(?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, sellerName);
			ps.setString(3, category);
			ps.setString(4, price);
			ps.setString(5, itemCondition);
			ps.setString(6, description);
			ps.executeUpdate();
			ret = "success";
			
		} 
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
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
