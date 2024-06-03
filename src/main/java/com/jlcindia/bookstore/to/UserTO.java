package com.jlcindia.bookstore.to; 

public class UserTO { 
  
private int userId; 
private String fullName; 
private String email; 
private long phone; 
private String dob; 
private String city; 
private String username; 
private String password; 
private String status;

public UserTO() {}

public UserTO( String fullName, String email, long phone, String dob, String city, String username,String password) {
	super();
	
	this.fullName = fullName;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.city = city;
	this.username = username;
	this.password = password;
	
}

public UserTO(int userId, String fullName, String email, long phone, String dob, String city, String username,
		String password, String status) {
	super();
	this.userId = userId;
	this.fullName = fullName;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.city = city;
	this.username = username;
	this.password = password;
	this.status = status;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
} 







}