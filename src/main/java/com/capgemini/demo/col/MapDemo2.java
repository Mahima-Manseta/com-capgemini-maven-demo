package com.capgemini.demo.col;

import java.util.*; 

public class MapDemo2 {
	
	public static void main(String args[]){  
		  
		   LinkedHashMap<Integer,String> num_map=new LinkedHashMap<Integer,String>();  
		   num_map.put(1,"ONE");  
		   num_map.put(2,"TWO");  
		   num_map.put(3,"THREE");
		   num_map.put(4,"FOUR");
		   num_map.put(5,"FIVE");
		   System.out.println("The contents of LinkedHashMap:");
		  
		   for(Map.Entry m:num_map.entrySet()){  
		        System.out.println(m.getKey()+" "+m.getValue());  
		   }  
		 }  
}
