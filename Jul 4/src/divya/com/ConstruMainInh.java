package divya.com;
class A{
	A(){
	
		System.out.println("Class A const");
	}
}

class B extends A{

 
	B(){
		
		System.out.println("Class B Const ");
	}
}
class C extends B{
	public C() {
		
		System.out.println("C class constr");
		
	}
}

public class ConstruMainInh {

	public static void main(String[] args) {
		
       C cob=new C();
	}

}

