package divya.com;


import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	float esalary;
	public Employee(int eid, String ename, float esalary) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public Employee() {
		
	}

	void display() {
		System.out.println("Eid="+eid);
		System.out.println("Ename="+ename);
		System.out.println("Esalary="+esalary);
	}

	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		ename=sc.nextLine();
		System.out.println("Enter employee id");
		eid=sc.nextInt();
		System.out.println("Enter employee salary");
		esalary=sc.nextFloat();
	}

	//setter and getter method
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	
	
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		//constructor
		Employee e1=new Employee(10,"Kiran",8976.23f);
		Employee e2=new Employee(111,"Ramesh",8974.23f);
		Employee e3=new Employee(112,"Manoj",8974.23f);
		e1.display();
		e2.display();
		e3.display();
		
		//user input
		Employee eob=new Employee();
		eob.input();
		eob.display();
		
		//setter and getter method
		Employee eobsetget=new Employee();
		eobsetget.setEid(76);
		eobsetget.setEname("Ravi");
		eobsetget.setEsalary(4567.4f);
		
		System.out.println(eobsetget.getEid());
		System.out.println(eobsetget.getEname());
		System.out.println(eobsetget.getEsalary());
		


	}

}
