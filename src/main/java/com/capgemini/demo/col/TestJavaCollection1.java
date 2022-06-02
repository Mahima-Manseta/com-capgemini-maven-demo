package com.capgemini.demo.col;

import java.util.*;  

public class TestJavaCollection1 {
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("AB");
		list.add("CD");  
		list.add("EF");  
		list.add("GH");  
		 
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
