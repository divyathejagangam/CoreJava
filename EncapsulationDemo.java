package divya.com;
import java.util.Scanner;
class Circle{   //blue print
	 float radius;  //state of a classor instance variable of a class or member data
float area;
	
void inputData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextFloat();
		sc.close();
	}
	
	//calculate the area
	 void calculateArea() {
		float pi=3.14159f;
		area=pi*radius*radius;
	}
	
	void displayArea() {
		System.out.println("area of cicle of radius "+radius+" is"+area);
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calculate a circle
		//Encapsulation is wrapping of memeber data(state) and member function (behaviour) inside the class
		//only member function can access member data of a class

		
			
				System.out.println("main method");
				//create an object
				
				Circle cob = new Circle();// its a realtime entity
				Circle cob1 = new Circle();
				Circle cob2= new Circle();
				
				cob.inputData();
				cob.calculateArea();
				cob.displayArea();
				
				cob1.inputData();
				cob1.calculateArea();
				cob1.displayArea();
				
				
				cob2.inputData();
				cob2.calculateArea();
				cob2.displayArea();
				
			}

	}


			


