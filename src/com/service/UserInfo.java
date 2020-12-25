package com.service;

public class UserInfo {
	
		private String userName;
		private String password;
		private String email;
		private String country;
		
		public UserInfo(String userName, String password, String email, String country) 
		{
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.country = country;
		}
		
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "UserInfo [Name=" + userName + ", password=" + password + ", email=" + email + ", country="
					+ country + "]";
		}

	
}
