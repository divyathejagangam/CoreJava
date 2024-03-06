package com.divya.mapping;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hmap=new HashMap<String,String>();
		hmap.put("9989391555","Divya");
		hmap.put("9258630157", "Bhavya");
		hmap.put("7896582563", "Alaknanda");
		System.out.println(hmap);
		
		for(Map.Entry<String, String> eob:hmap.entrySet()) {
			System.out.println(eob.getKey()+eob.getValue());
			
		}
	}

}
