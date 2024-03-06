package com.edu.empsort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeSortMainApp {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"A",100.1f);
		Employee e2=new Employee(12,"B",5884.7f);
		Employee e3=new Employee(100,"D",1569.88f);
		Employee e4=new Employee(15,"Z",12369.02f);
		Employee e5=new Employee(109,"G",6523.27f);

		TreeSet<Employee> tst=new TreeSet<Employee>(new EmployeeSortId());
		tst.add(e1);
		tst.add(e2);
		tst.add(e3);
		tst.add(e4);
		tst.add(e5);
		
		System.out.println("Sorting is done based on eid");
		Iterator<Employee> itemp=tst.iterator();
		while(itemp.hasNext()) {
			Employee e=itemp.next();
			System.out.println(e.eid+"\t"+e.ename+"\t"+e.esalary);
		}
		
		//based on sal sorting
		
		TreeSet<Employee> tst1=new TreeSet<Employee>(new EmployeeSortSalary());
		tst1.add(e1);
		tst1.add(e2);
		tst1.add(e3);
		tst1.add(e4);
		tst1.add(e5);
System.out.println("Sorting is done based on salary");
		Iterator<Employee> itemp1=tst1.iterator();
		while(itemp1.hasNext()) {
			Employee e=itemp1.next();
			
			System.out.println(e.eid+"\t"+e.ename+"\t"+e.esalary);
		}

		//based on name sorting
		
		TreeSet<Employee> tst2=new TreeSet<Employee>(new EmployeeSortName());
		tst2.add(e1);
		tst2.add(e2);
		tst2.add(e3);
		tst2.add(e4);
		tst2.add(e5);
		System.out.println("SORTING BASED ON NAME");
		Iterator<Employee> itemp2=tst2.iterator();
		while(itemp2.hasNext()) {
			Employee e=itemp2.next();
			
			System.out.println(e.eid+"\t"+e.ename+"\t"+e.esalary);
		}
	}
	

	}



