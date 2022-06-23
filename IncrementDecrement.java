package divya.com;

public class IncrementDecrement {



			public static void main(String[] args) {

		        int i=3, j=1, k,z;
		        ++i; //preincremet
		        System.out.println("i="+i); //4
		        i++;  //post increment
		        System.out.println("i="+i); 
		        
		        //Expression
		        k=j++; //postincrement in expression
		        System.out.println("k="+k);//1
		        System.out.println("j="+j);//2
		        
		        k=++j;
		        System.out.println("k="+k);//3
		        System.out.println("j="+j);//3
		        
		        z=k++ + ++j; //z=3+4=7
		        System.out.println("z="+z);//7
		        System.out.println("k="+k);//4
		        System.out.println("j="+j);//4

			}

		


	}


