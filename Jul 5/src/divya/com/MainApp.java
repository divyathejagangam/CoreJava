package divya.com;

//Constructor calling in abstract class

abstract class MyAbstractclass1{
	private int pdata;
	public MyAbstractclass1(int pdata){
		System.out.println(pdata+10);
	}
}

class ChildClass extends MyAbstractclass1{

	public ChildClass(int pdata) {
		super(pdata); //calls super class constructor
		}
}

public class MainApp {

	public static void main(String[] args) {
		ChildClass ob=new ChildClass(45);
	}

}

