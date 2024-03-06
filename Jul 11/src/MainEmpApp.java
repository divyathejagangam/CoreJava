
//Main.java
//Userdefined class for arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainEmpApp {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Manoj", 3452.89f);
		Employee e2=new Employee(2, "kiran", 4452.89f);
		Employee e3=new Employee(3, "Swetha", 5452.89f);
		Employee e4=new Employee(4, "Ravi", 6452.89f);
		
		ArrayList<Employee> arremp=new ArrayList<Employee>();
		arremp.add(e1);
		arremp.add(e2);
		arremp.add(e3);
		arremp.add(e4);
		System.out.println(arremp);
		//Iterator
			
				Iterator<Employee> eit=arremp.iterator();
				System.out.println("Eid\tename\tesalary");
				
				while(eit.hasNext()) {
				Employee e=eit.next();
				System.out.println(e.eid+"\t"+e.ename+"\t"+e.esalary);
				
	}
				
				
				//Iterator for salary sort
				EmployeeSalSort esal=new EmployeeSalSort() {
				Collections.sort(arremp,esal);
	}
				
	}
	
		
	}
	class EmployeeSalSort implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if(o1.esalary>o2.esalary) {
				return 1;
			}else if(o1.esalary==o2.esalary) {
				return 0;
			}else {
				return -1;
		}
}}