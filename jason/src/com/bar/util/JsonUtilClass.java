package com.bar.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

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
			JSONArray ja=(JSONArray)jo.get("member");
			
			for(int j=0 ; j<ja.size();j++)
			{
				JSONObject details=(JSONObject) ja.get(j);
				
				Object mailObj=details.get("mail");
				String mail= (String)mailObj;
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
