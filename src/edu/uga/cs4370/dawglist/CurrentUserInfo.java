package edu.uga.cs4370.dawglist;

import com.opensymphony.xwork2.ActionSupport;

public class CurrentUserInfo extends ActionSupport {
		public static int currentUserID;
		public static String currentName, currentEmail;
		
	 
		public void setcurrentUserID(int currentUserID) {
			this.currentUserID = currentUserID;
		}
		
		public int getCurrentUserID(){
			return currentUserID;
		}
		
		public void setcurrentName(String currentName) {
			CurrentUserInfo.currentName = currentName;
		}
		public String getCurrentName(){
			return currentName;
		}
		
		public void setcurrentEmail(String currentEmail) {
			this.currentEmail = currentEmail;
		}
		public String getCurrentEmail(){
			return currentEmail;
		}
		
}
