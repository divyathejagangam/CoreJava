package divya.com;

abstract class Bank{
	  abstract float rateOfInterset();
	  void display() {
		  System.out.println("Display menthod");
	  }
}
class SBI extends Bank{

	@Override
float rateOfInterset() {
		// TODO Auto-generated method stub
		return 7.5f;
	}
	
}
class HDFC extends Bank{

	@Override
	float rateOfInterset() {
		// TODO Auto-generated method stub
		return 6f;
	}
	
}

public class BankMain {

	public static void main(String[] args) {
		SBI sob=new SBI();
		System.out.println("Rate of interest of SBI="+sob.rateOfInterset());
		sob.display();
		HDFC hob=new HDFC();
		System.out.println("Rate of interest of HDFC="+hob.rateOfInterset());
		hob.display();
				
   }

}
