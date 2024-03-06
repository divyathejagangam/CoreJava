package com.divya.mapping;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm=new TreeMap<String,String> ();
		tm.put("9989391555","Divya");
		tm.put("9258630157", "Bhavya");
		tm.put("7896582563", "Alaknanda");
		System.out.println(tm);
		for(Map.Entry<String, String> eob:tm.entrySet()) {
			
			System.out.println(eob.getKey()+eob.getValue());
		}
	}

}
