package divya.com;

//Custom Exceptions are user defined exception
//When user wants custom exceptions , user has class has to extend with Exception class
//and call super class constructor


class AgeCheckException extends Exception{
	  public AgeCheckException(String s) {
		  super(s);
	  }
}

class VoteAge{
	public void checkAgeVote(int age) {
		if(age<18) {
			try {
				//throw new AgeCheckException("not eligible for voting");
				AgeCheckException erob=new AgeCheckException("not eligible for voting");
				throw erob;
			}catch(AgeCheckException e)
			{
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Eligible for voting");
		}
	}
}

public class CustomExceptionMain {

	public static void main(String[] args) {
		VoteAge vob=new VoteAge();
		vob.checkAgeVote(21);
	}

}
