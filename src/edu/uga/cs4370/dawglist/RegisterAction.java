package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterAction {
	private String customerUsername, customerEmail, customerPass;
	private int userID;
	
	public String execute(){
		String ret = null;
		try{
			if(!customerEmail.endsWith("uga.edu")){
				ret = "failure";
			}
			
			userID = (int)(100000 + Math.random() * 900000);
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("insert into userDB values(?,?,?,?)");
			
			if((customerUsername.equals(""))||(customerEmail.equals(""))||(customerPass.equals(""))){
				ret = "failure";
			}
			else{
				ps.setInt(1, userID);
				ps.setString(2, customerUsername);
				ps.setString(3, customerEmail);
				ps.setString(4, customerPass);
				ps.executeUpdate();
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
	
	public String getCustomerEmail(){
		return customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail){
		this.customerEmail = customerEmail;
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
