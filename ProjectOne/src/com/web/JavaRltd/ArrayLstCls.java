package com.web.JavaRltd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayLstCls {
	
	@Test()
	public void arrayLstMth(){
		List<String> arr=new ArrayList<String>();
		/*This is how elements should be added to the array list*/
		
		arr.add("vijay");
		arr.add("Mohiddin");
		arr.add("Shiva");
		arr.add("Chandrika");
		arr.add("Asha");
		arr.add("Sjna");
		System.out.println(arr);
		
		arr.remove("Mohiddin");
		System.out.println(arr);
		
		/*  SORTING */
		System.out.println("Sorting");
		Collections.sort(arr);
		System.out.println("After Sorting");
		for(String s:arr){
			System.out.println(s);
		}
		System.out.println("In reverse Order");
		
		Collections.reverse(arr);
		
		for(String ds:arr){
			System.out.println(ds);
		}
		
		// add(int index, Object o)
		arr.add(2,"Mohiddin");
		arr.add("Mohiddin");
		//remove(Object o)
		//remove(int index)
		// set(int index, Object o)
		//int indexOf(Object o)
		//Object get(int index)
		
		System.out.println("***************************"+arr.indexOf("Mohiddin"));
		
	}

}
