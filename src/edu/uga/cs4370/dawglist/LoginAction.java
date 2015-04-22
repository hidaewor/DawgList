package edu.uga.cs4370.dawglist;

import java.sql.*;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String customerUsername, customerPass;
	private int userID;
	public String execute(){
		String ret = null;
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
}
