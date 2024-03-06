package divya.com;


		 class ConstructorClass {
		    int id;
		    String name;
			public ConstructorClass(int id, String name) {
				super();
				this.id = id;//this refers to present object

				this.name = name;
			}
			
			void display() {
				System.out.println("Id="+id);
				System.out.println("Name="+name);
			}
		     
		 }

		public class ConstructorMain {

			public static void main(String[] args) {
			     ConstructorClass ob=new ConstructorClass(12, "Sangeetha");
			     ob.display();
			     
			     
			}

		

	}


