package packageabstact;

public abstract class Bclass {
	
	//1.abstract method
   abstract	public void run() ;
   
   //2.Instance Method
   public void win() {
	   System.out.println("team india- instance");
	                 }
	//3.Static Method  
   public static void myStatic() {
	   System.out.println("my static-static");
                   }
	   
   //4.Final Method
   public final void myFinal() {
	   System.out.println("my Final method-final");
   }
   
   //5.Constructer Method
   Bclass(){
	   System.out.println("my team win-constructer");
	   
   }
   
   
   
   
   }


