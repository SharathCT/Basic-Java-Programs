package packageabstact;

public class Cclass extends Bclass{

	
	@Override
	public void run() {
		
		System.out.println("bike is running-dderived");
		
	}

	
    public static void main(String[] args) {
		
    	myStatic();
		Bclass B= new Cclass();
		B.run();
		B.win();
		B.myFinal();
		
		

	}

	
	
}
