package com.edu.empsort;
import java.util.Comparator;

public class EmployeeSortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.esalary==e2.esalary)
		return 0;
		else if(e1.esalary>e2.esalary)
			return 1;
		else 
			return 0;
	}

}

