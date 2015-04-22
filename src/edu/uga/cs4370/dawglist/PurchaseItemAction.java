package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PurchaseItemAction {
	
	private int itemID;
	
	public String execute(){
		String ret = null;
		try{
			
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("delete from itemdb where itemID = ?");
			ps.setInt(1, itemID);
			ps.executeUpdate();
			//we also need to generate a receipt
			
			
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
}
