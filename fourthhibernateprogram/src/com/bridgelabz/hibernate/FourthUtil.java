package com.bridgelabz.hibernate;





public class FourthUtil 
{
	
public static void main(String[] args) {
	
FourthDAO da=new FourthDAO();

FourthDTO dt=new FourthDTO();
dt.setP_email("1raghuram3@gmail.com");
dt.setP_id(1);
dt.setP_name("raghava");

da.add(dt);
/*if(n>1)
{
	System.out.println("inserted");
}*/
FourthDTO dk=da.fetchbyName("raghav");
System.out.println(dk.getP_email());
System.out.println(dk.getP_id());
System.out.println(dk.getP_name());
	
}
	
}
