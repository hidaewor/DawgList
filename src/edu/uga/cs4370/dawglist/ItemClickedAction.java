package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemClickedAction {
	ArrayList<TableItem> itemList = new ArrayList<TableItem>();
	private int itemClicked;

	public String execute(){
		String ret = null;
		try{
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("select * from itemdb where itemID = ?");
			ps.setInt(1, itemClicked);
			ResultSet rs =  ps.executeQuery();
			while(rs.next()){
				TableItem item = new TableItem();
				item.setItemID(rs.getInt(1));
				item.setSellerID(rs.getInt(2));
				item.setSellerName(rs.getString(3));
				item.setSellerEmail(rs.getString(4));
				item.setItemName(rs.getString(5));
				item.setCategory(rs.getString(6));
				item.setPrice(rs.getInt(7));
				item.setItemCondition(rs.getString(8));
				item.setDescription(rs.getString(9));
				itemList.add(item);
			}
			ret = "success";
			con.close();
			
		} 
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
	public ArrayList<TableItem> getItemList(){
		return itemList;
	}
	
	public void setList(ArrayList<TableItem> itemList){
		this.itemList = itemList;
	}
	
	public int getItemClicked(){
		return itemClicked;
	}
	public void setItemClicked(int itemClicked){
		this.itemClicked = itemClicked;
	}
}
