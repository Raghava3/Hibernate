package com.bridgeit.util;

import com.bridgeit.DAO.UserDAO;
import com.bridgeit.DTO.User;

public class UserTester {
	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setName("Uma");
		user.setAge(24);
		
		UserDAO dao=new UserDAO();
		dao.saveUser(user);
	}
}
