package com.jspider.bank.data;
import  com.jspider.bank.entity.User;
public interface UserData {
	void addUser(User user);
	
	void deleteUser(int securityPin);
	
	void updateUser(int securityPin);
	
	void findUser(int securityPin);
}
