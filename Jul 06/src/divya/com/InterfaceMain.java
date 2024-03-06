package divya.com;

interface MyInterface{
    int val=10; //public static final int val=10; //
   void interfaceMethod1(); //public abstract void interfaceMethod();
    void interfaceMethod2();
}

/*In the interface 
--->all the variables are by default public static and final
----> methods or functions are by default public abstract
*/

//In java a class can implement any no of interfaces 
//but a class extend only one class
//Ex :  class A extends SingleClass implements Intf1, intf2, intf2........{}
//through interface we can achieve multiple inheritance
//one interface can extends any number of interface
//ex: interface Interface_name extends inf2,inf2,....{}

class MyClass implements MyInterface{

	@Override
	public void interfaceMethod1() {
		System.out.println("interfaceMethod1");
		
	}

	@Override
	public void interfaceMethod2() {
		
		System.out.println("interfaceMethod2");
	}

//you have to override all the methods of the interface otherwise make the
//class as abstract

}


public class InterfaceMain{
 public static void main(String args[]){
          MyClass ob=new MyClass();
              ob.interfaceMethod1();
               ob.interfaceMethod2();
 }
}
