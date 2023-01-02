package com.packafe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Myclass {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("sharath");
		al.add("ram");
		al.get(1);
		
		
		LinkedList <Object> ll=new LinkedList<Object>();
		ll.add("pojo");
		ll.add(2);
		
		System.out.println("linked list" + ll);
		
		System.out.println(al);
		
		

	}

}
