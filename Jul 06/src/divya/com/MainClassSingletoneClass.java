package divya.com;

class SingletoneClass{
public static SingletoneClass sob=new SingletoneClass();

    private SingletoneClass(){
       System.out.println("Constructor of Singletoneclass");
   }
  public static SingletoneClass getSingletoneClassObject(){
	   
     return sob;
  }
public void display(){
 System.out.println("Display");
}
}

public class MainClassSingletoneClass{
    public static void main(String args[]){
          //SingletoneClass ob=new SingletoneClass(); //error because private constr
          SingletoneClass ob=SingletoneClass.getSingletoneClassObject();
              ob.display(); 
      
   }
}

