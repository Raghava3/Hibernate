package com.bar;

public class util {
	public static void main(String[] args) 
	{
		
		DTO dt=new DTO();
		dt.setP_email("1raghuram3@gmail.com");
		dt.setP_id(11);
		dt.setP_name("raghava");
		DAO da=new DAO();
		int i=da.add(dt);
		if(i>0)
		{
			System.out.println("sucessfully inserted");
		}
	DTO dto=da.fetchbyid(1);
		
	System.out.println(dto.getP_email());
	System.out.println(dto.getP_id());
System.out.println(dto.getP_name());	
}

}
