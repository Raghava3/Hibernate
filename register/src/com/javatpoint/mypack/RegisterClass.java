package com.javatpoint.mypack;

public class RegisterClass {

	public static void main(String[] args)
	{
	    User  user=new User();
	    user.setEmail("1raghuram3@gmail.com");
	    user.setName("raghava");
	    user.setPassword("qwerty");
		UserDao ud=new UserDao();
		Integer i=ud.register(user);
	int k=	i.intValue();
	System.out.println(k);
		if(k==1)
		{
			System.out.println("sucessfull inserted");
		}
	}
	
}
