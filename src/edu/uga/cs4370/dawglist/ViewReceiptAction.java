package edu.uga.cs4370.dawglist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewReceiptAction {

	ArrayList<ReceiptTableItem> receiptList = new ArrayList<ReceiptTableItem>();

	public String execute(){
		String ret = null;
		try{
			String database = "jdbc:mysql://localhost:3306/dawglist";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(database, "root", "");
			PreparedStatement ps = con.prepareStatement("select * from receiptDB where customerID = ?");
			ps.setInt(1, CurrentUserInfo.currentUserID);
			ResultSet rs =  ps.executeQuery();
			while(rs.next()){
				ReceiptTableItem item = new ReceiptTableItem();
				item.setOrderID(rs.getInt(1));
				item.setOrderTime(rs.getString(2));
				item.setItemID(rs.getInt(3));
				item.setCustomerID(rs.getInt(4));
				item.setSellerID(rs.getInt(5));
				receiptList.add(item);
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
	
	public ArrayList<ReceiptTableItem> getReceiptList(){
		return receiptList;
	}
	
	public void setList(ArrayList<ReceiptTableItem> receiptList){
		this.receiptList = receiptList;
	}
}
