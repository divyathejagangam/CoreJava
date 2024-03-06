package student.com.packg;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MainAppStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Manoj", 21.0f,10000.00f);
		Student s2=new Student(2, "kiran", 15.89f,52200.44f);
		Student s3=new Student(3, "Swetha", 24.89f,96586.45f);
		Student s4=new Student(4, "Ravi", 16.89f,89698.25f);
		
		LinkedList<Student> arrstu=new LinkedList<Student>();
		arrstu.add(s1);
		arrstu.add(s2);
		arrstu.add(s3);
		arrstu.add(s4);
		System.out.println(arrstu);
		//Iterator
		
		Iterator<Student> sit=arrstu.iterator();
		System.out.println("sid"+"\t"+"sname"+"\t"+"sage"+"\t"+"sfee");
		while(sit.hasNext()) {
		Student s=sit.next();
		System.out.println(s.sid+"\t"+s.sname+"\t"+s.sage+"\t"+s.sfee);
		}
		
		//Iterator name sorting
		Collections.sort(arrstu,new StudentNameSort());
		Iterator <Student> snam=arrstu.iterator();
		System.out.println("Sid"+"\t"+"sname"+"\t"+"sage"+"\t"+"sfee");
		while(snam.hasNext()) {
			
			Student s=snam.next();
			System.out.println(s.sid+"\t"+s.sname+"\t"+s.sage+"\t"+s.sfee);
		}
		
		//iterator age sorting
		
		Collections.sort(arrstu,new StudentSageSort());
		Iterator <Student> sag=arrstu.iterator();
		System.out.println("AGE SORTING");
		System.out.println("STudentID"+"\t"+"Student Name"+"\t"+"Student Age"+"\t"+"Student Fees");
		while(sag.hasNext()) {
			
			Student s=sag.next();
			System.out.println(s.sid+"\t\t"+s.sname+"\t\t"+s.sage+"\t\t"+s.sfee);
		}
		
		
		
		//iterator sort fee
		
		Collections.sort(arrstu,new StudentSageSort());
		Iterator <Student> sfe=arrstu.iterator();
		System.out.println("FEE SORTING");
		System.out.println("STudentID"+"\t"+"Student Name"+"\t"+"Student Age"+"\t"+"Student Fees");
		while(sfe.hasNext()) {
			
			Student s=sfe.next();
			System.out.println(s.sid+"\t\t"+s.sname+"\t\t"+s.sage+"\t\t"+s.sfee);
		}
		
		
		}
	}
		class StudentSageSort implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.sage>o2.sage) {
					return 1;
				}else if(o1.sage==o2.sage) {
					return 0;
				}else {
					return -1;
				}
			}
		
		
	}
		class StudentFeeSort implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.sfee>o2.sfee) {
					return 1;
				}else if(o1.sfee==o2.sfee) {
					return 0;
				}else {
					return -1;
				}
			}}
			
			
			class StudentNameSort implements Comparator<Student>{
			
				@Override
				public int compare(Student o1, Student o2) {
					return o1.sname.compareTo(o2.sname);
				}
				
				
				
			}
			
		
	
	
