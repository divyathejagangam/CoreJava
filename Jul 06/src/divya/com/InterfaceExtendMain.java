package divya.com;
/** extends One, Two**/
interface One{
	void m1();
}
interface Two{
	void m2();
}

interface Three{
	void m3();
}

class IntClass implements One,Two,Three{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3");
	}
	
}
public class InterfaceExtendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntClass ob=new IntClass();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

