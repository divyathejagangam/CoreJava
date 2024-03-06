package divya.com;

abstract class Myabstractclass{ 
	void display() {
		System.out.println("Display method");
	}
}

public class AbstractClass extends Myabstractclass{

	public static void main(String[] args) {
		//Myabstractclass ob= new Myabstractclass(); //for abstract class object creation is not possible
		AbstractClass ob=new AbstractClass();
		ob.display();
	}

}

