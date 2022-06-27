package divya.com;



import java.util.Scanner;

class Area{        //formal parameter
	int squareArea(int side) { //function with arg and with return type
		return side*side;
	}
	
	void reactangleArea(int l, int b) { //with args and no return type
	System.out.println("Area of reactangle ="+(l*b));
   }
	
	void triangleArea() { //no arg() no return type void
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter base and height of a triangle");
		int base=sc1.nextInt();
		int height=sc1.nextInt();
		
		float ar=(base*height)*0.5f;
		System.out.println("Area of Triangle "+ar);
		
		
	}
	
	public float circleArea() { //with return type and no argument
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter radius of a circle");
		float radius=sc1.nextFloat();
		
		return (3.14159f*radius*radius);
	}
}

public class AreaMain {

	public static void main(String[] args) {
		//Menu driven program 
		int side;
		Area aob = new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Calculate area of square");
		System.out.println("2.Calculate Area of Reactangle");
		System.out.println("3.Calculate area of triangle");
		System.out.println("4.CalculateArea of Circle");
		
		int ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter the side of square");
		         side=sc.nextInt();
		         int a=aob.squareArea(side);//actual parameter
		         System.out.println("Area of square ="+a);
		         break;
		case 2: System.out.println("Enter length and breadth of a reactangle");
		          int len=sc.nextInt();
		          int br=sc.nextInt();
		          aob.reactangleArea(len, br); 
		          break;
		case 3:  aob.triangleArea();
		          break;
		case 4: float ar1=aob.circleArea();    
		          System.out.println("Area of circle="+ar1);
		          break;
		default: System.out.println("Invalid input");
		}
		
		
	}}
		

	



