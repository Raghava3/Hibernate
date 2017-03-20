package com.Bridgelabz;



public class util {

	public static void main(String[] args) {
		
		FifthDAO da=new FifthDAO();

		FifthDTO dt=new FifthDTO();
		dt.setP_email("1raghuram3@gmail.com");
		dt.setP_id(1);
		dt.setP_name("raghavaj");
	  //  String n=da.add(dt);
	 //   System.out.println("name"+n);
	  FifthDTO dk=da.fetchbyName("raghavaj");
	  System.out.println(dk.getP_email());
	  System.out.println(dk.getP_id());
	  System.out.println(dk.getP_name());
			
		}
	
}
