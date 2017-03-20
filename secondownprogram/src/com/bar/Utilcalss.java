package com.bar;

public class Utilcalss {

	public static void main(String[] args) {
		
		DTO dt=new DTO();
		dt.setEmail("1raghuram3@gmail.com");
		dt.setId(1);
		dt.setName("raghava");
		DAO da=new DAO();
	da.add(dt);
	}
	
}
