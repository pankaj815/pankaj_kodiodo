package com.cjc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Departement {

	
	
	public static void main(String []args)
	{
		//Departments and Employees

	Map<String,String> m=new HashMap<>();
	m.put("Computer Science","Dhiraj");
	m.put("Mechanical","Niraj");
	m.put("ArtificialInteligence","Ram");
	m.put("Electrical","Sham");
	m.put("Civil","Prem");


	Set<String> keys=m.keySet();
	System.out.println(keys);

	Iterator <String> itr=keys.iterator();
	while(itr.hasNext())
	{

	//for(String key:keys)
	
     String key=itr.next();
	String value=m.get(key);

	System.out.println("Department = "+key + " : Employees Name = "+value);
	}
	}
	}

	
	

