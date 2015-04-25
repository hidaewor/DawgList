package edu.uga.cs4370.dawglist;

import java.sql.*;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String customerUsername, customerPass;
	private int userID;
	ArrayList<TableItem> list = new ArrayList<TableItem>();
	
	public String execute(){
		String ret = "failure";
		try{
			
			
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("select * from userDB where customerUsername = ? and customerPass = ?");
			ps.setString(1, customerUsername);
			ps.setString(2, customerPass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				CurrentUserInfo.currentUserID = (rs.getInt(1));
				//CurrentUserInfo.currentName = (rs.getString(4));;
				CurrentUserInfo.currentEmail = (rs.getString(3));
				ret = "success";
			}
			else{///*************/made changes here/***************//
				ret="failure";
			}
			//Show homepage stuff
			ps = con.prepareStatement("select * from itemdb");
			rs =  ps.executeQuery();
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
			con.close();
			
		} 
		catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
		
	}
	public String getCustomerUsername(){
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername){
		this.customerUsername = customerUsername;
	}
	
	public int getUserID(){
		return userID;
	}
	
	public void setUserID(int userID){
		this.userID = userID;
	}
	
	public String getCustomerPass(){
		return customerPass;
	}
	
	public void setCustomerPass(String customerPass){
		this.customerPass = customerPass;
	}
	
	public ArrayList<TableItem> getList(){
		return list;
	}
	
	public void setList(ArrayList<TableItem> list){
		this.list = list;
	}
}
