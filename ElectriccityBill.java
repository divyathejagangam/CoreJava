package divya.com;

import java.util.Scanner;
		// TODO Auto-generated method stub
	
		class ElectriccityBill{
			//instance variables
			String cname;
			int units;
			float bamount;
			
			void inputData() {
			//input data
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter consumer name");
			cname = sc.nextLine();
			
			System.out.println("Enter number of units");
		    units = sc.nextInt();
			}
			
			void calculateBillAmount() {
		    if(units <= 0) {
		    	System.out.println("Number of units should not be zero or negative");
		    	System.exit(0);
		    }
		   
		    if(units >=1 && units <= 100) {
		    	bamount = units*2.0f;
		    }
		    else if(units >= 101 && units <= 300) {
		    	bamount = 100*2.0f+(units-100)*3.0f;
		    }
		    else {
		    	bamount = 100 *2.0f+(units-200)*3.0f+(units-300)*5.0f;
		    	bamount = bamount + (bamount*2.5f)/100;
		    }
		 }
			void displayConsumerDetails() {
				System.out.println("name ="+cname);
			    System.out.println("Units="+units);
			    System.out.println("Bill amount="+bamount);
			}

		

		public class ElectricityBillMain {
			public static void main(String[] args) {
				//By creating an object
				ElectriccityBill ob = new ElectriccityBill();
				ob.inputData();
				ob.calculateBillAmount();
				ob.displayConsumerDetails();
				
			}
		}

	}


