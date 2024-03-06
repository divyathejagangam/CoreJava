package com.edu.empsort;

import java.util.Comparator;

public class EmployeeSortId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.eid==o2.eid)
			return 0;
		else if(o1.eid>o2.eid)
			return 1;
		else 
			return -1;
	}

}
