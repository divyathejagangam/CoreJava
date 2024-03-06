package divya.com;

//Function overriding run time polymorphisam
//defining function in parent and child class with same return type , function name and argument list
//

class Parent1{
	public void display() {
		System.out.println("Parent display");
		parentM2();
	}
	private void parentM2() {
		System.out.println("Private method parent m2");
	}
}

class Child1 extends Parent1{
	void m1() {
		System.out.println("child function m1");
	}
	public void display() { //function overriding
		super.display();
		System.out.println("Child display");
		
	}
}

public class FunctionOverridingMain {

	public static void main(String[] args) {
		//Parent1 ob=new Child1();
		Child1 ob=new Child1();
		ob.m1();
		ob.display();
		Parent1 ob1=new Parent1();
		ob1.display();
	}

}

