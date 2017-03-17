package com.bar.util;

import com.bar.dao.StudentDao;
import com.bar.dto.Studentdata;

public class StudentUtil {

	public static void main(String[] args) {
	
		Studentdata st=new Studentdata();
		st.setName("raghava");
		st.setEmail("ragahaaa@gmail.com");
		st.setAddress("s1");
		StudentDao st1=new StudentDao();
		st1.add(st);
		st1.listEmployees();
		st1.updateEmployee("ragahaaa@gmail.com", "salary");
	}
	

}
