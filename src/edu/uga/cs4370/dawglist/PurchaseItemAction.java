package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PurchaseItemAction {
	
	private int itemID;
	
	public String execute(){
		String ret = null;
		try{
			//we need to generate a receipt
			//
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("select * from itemdb where itemID = ?");
			ps.setInt(1, itemID);
			ResultSet rs =  ps.executeQuery();
			int sellerID = 0;
			String itemName = "";
			int itemPrice = 0;
			while(rs.next()){
				sellerID = (rs.getInt(2));
				itemName = rs.getString(5);
				itemPrice = rs.getInt(7);
			}
			ret = "success";
			
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(cal.getTime());
			int currentID = CurrentUserInfo.currentUserID;
			//generate orderID
			int orderID = (int)(100000 + Math.random() * 900000);
			
			ps = con.prepareStatement("insert into receiptdb values(?,?,?,?,?,?,?)");
			ps.setInt(1, orderID);
			ps.setString(2, currentTime);   
			ps.setInt(3, itemID);   
			ps.setInt(4, currentID);   
			ps.setInt(5, sellerID); 
			ps.setString(6, itemName);  
			ps.setInt(7, itemPrice);  
			ps.executeUpdate();
			
			/*
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			*/
			ps = con.prepareStatement("delete from itemdb where itemID = ?");
			ps.setInt(1, itemID);
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
}
