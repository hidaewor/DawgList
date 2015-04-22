package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;

public class SelectItemAction {
	
	ArrayList<TableItem> list = new ArrayList<TableItem>();

	public String execute(){
		String ret = null;
		try{
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("select * from itemdb");
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
				list.add(item);
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
	
	public ArrayList<TableItem> getList(){
		return list;
	}
	
	public void setList(ArrayList<TableItem> list){
		this.list = list;
	}
}
