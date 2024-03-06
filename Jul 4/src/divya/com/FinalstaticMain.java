package divya.com;


class Employee1{ //if the class is final you cannot have child class
	// final int i=10;//cannot change the value //final is like const
	  /*final void inputData() { //if the method is final you cannot override in the subclass
		 
	 }*/
	 String name;
	 static String companyname;
	 static { //used for static data initialization
		 companyname="Edubridge";
		 System.out.println("static1");
	 }
	 static {
		 System.out.println("static2");
	 }
	 
	 public static void staticMethod() { //static method override 
		 System.out.println("Static method employee "+companyname);
		 
	 }
	 public void nonstaticmethod() {
		 System.out.println("name="+name);
		 System.out.println("static "+companyname);
	 }
	
}
class Accountant extends Employee1{
	public static void staticMethod() {
	//	super.staticMethod();//inside static method cannot be used
		                     //static methods cannot be overriden
		 System.out.println("Static method Accountant");
		 
	 }
}
public class FinalstaticMain {

	public static void main(String[] args) {
		Accountant aob =new Accountant();
		aob.staticMethod();
		Employee1.staticMethod(); //static method can be called with ref to classname or object
	}

}
