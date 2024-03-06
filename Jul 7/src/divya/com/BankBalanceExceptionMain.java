package divya.com;


//Custom Exceptions are user defined exception
//When user wants custom exceptions , user has class has to extend with Exception class
//and call super class constructor


class BankBalanceException extends Exception{
	  public BankBalanceException(String s) {
		  super(s);
}
}
class BankBalance{
	public void checkBalance(int balance) {
		if (balance<10000) {
			try {
				
				BankBalanceException bb=new BankBalanceException("CANNOT WITHDRAW CASH DUE TO LOW BALANCE");
				throw bb;
			}
			catch(BankBalanceException bb){
				bb.printStackTrace();
			}
		}
		
		else {
			System.out.println("YOU CAN WITHDRAW THE AMOUNT");
		}
	}
	
}


public class BankBalanceExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BankBalance b=new BankBalance();
			b.checkBalance(10000);
	}

}
