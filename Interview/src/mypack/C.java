package mypack;

public class C implements A ,B {



	

	@Override
	public void myA() {
		System.out.println("A");
		
	}

	@Override
	public void myB() {
		
	
		System.out.println("B");
	}
	
	
	
		public static void main(String[] args) {
		
		C c=new C();
		c.myA();
		c.myB();
		
	}
	
	
	
	

}
