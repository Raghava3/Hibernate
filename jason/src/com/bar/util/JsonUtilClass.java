package com.bar.util;


import java.io.FileReader;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bar.DAO.Dataaccessobject;
import com.bar.DTO.Jsonmembers;

public class JsonUtilClass
{
	public static void main(String[] args)   throws Exception
	{
			FileReader file=new FileReader("/home/bridgelabz3/Desktop/Raghava/raghava/jsonfromhibernate");
			JSONParser parser= new JSONParser();
			Object obj=parser.parse(file);
			Jsonmembers js=new Jsonmembers();
			Dataaccessobject ds=new Dataaccessobject();
			JSONObject jo=(JSONObject)obj;
			//this is the jason file
/*			{"member":[{"mail":"1raghuram3@gmail.com","name":"raghava","city":"Banglore",
 *           "country":"india","phoneno":"9980222222"},
 *           {"mail":"raghuram@gmail.com","name":"raghava","city":"Banglore","country":"india","phoneno":"9980222222"}]}
*/			//getting the value by passing the key member
			
			
			JSONArray ja=(JSONArray)jo.get("member");
			//getting the size of the json array 
			for(int j=0 ; j<ja.size();j++)
			{
				//creating  json object
				JSONObject details=(JSONObject) ja.get(j);
				//getting the  value of the mail by passing key
				Object mailObj=details.get("mail");
				//converting into the string 
				String mail= (String)mailObj;
				//setting the value of the mail
				js.setMail(mail);
				
				
				Object nameObj=details.get("name");
				String name=(String)nameObj;
				js.setName(name);
				
				
				Object cityObj=details.get("city");
				String city=(String)cityObj;
				js.setCity(city);
				
				
				Object countryObj=details.get("country");
				String country=(String)countryObj;
				js.setCountry(country);
				
				
				Object phonenoObj=details.get("phoneno");
				String phoneno=(String)phonenoObj;
				js.setPhoneno(phoneno);
				
				ds.saveUser(js);
				
			}
			
			

	}
}
