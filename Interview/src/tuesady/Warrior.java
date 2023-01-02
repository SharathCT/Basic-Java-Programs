package tuesady;

public class Warrior implements King {

	
	@Override
	public void myTarget() {
		System.out.println("That target need to Executed");
	}
        
	@Override
	public void myTeam() {
		
		System.out.println("My team");
		
	}
	
	
	public static void main(String[] args) {


		System.out.println(t);
		
		Warrior w=new Warrior();
		w.myTarget();
		w.myTeam();
		
		

	}

	

	
	
}
