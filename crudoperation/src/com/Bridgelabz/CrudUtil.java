package com.Bridgelabz;

import com.Bridgelabz.CRUDDAO;
import com.Bridgelabz.CRUDDTO;

public class CrudUtil {
	public static void main(String[] args) {
		
		CRUDDAO da=new CRUDDAO();
		CRUDDTO dt=new CRUDDTO();
		dt.setP_email("1raghuram33@gmail.com");
		dt.setP_id(1);
		dt.setP_name("raghraghsaaa");
		//da.add(dt);
    	//da.update("raghava","update");
		//CRUDDTO dk=da.retriveByPrimaryKey("update");
		//da.list();
	  //  da.delete("ragh");
  da.select();
		}
			

}
