package com.divya.mapping;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class LinkedHashMapXample {

	public static void main(String[] args) {
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("9989391555","Divya");
		hm.put("9704016085", "Bala");
		hm.put("9866410355","Rama");
		System.out.println(hm);
		//traversing map interface using for and Map.Entry (Similar to iterator in collections)
		for(Map.Entry<String, String> eob:hm.entrySet()) {
			System.out.println(eob.getKey()+"\t"+eob.getValue());
		}
		
	}
		
}
