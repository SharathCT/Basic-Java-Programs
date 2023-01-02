package mypack;

public class ForOverrridingMainMethod {

	public static void main(String str) {
		
		System.out.println("StringMainMethod");
	}
	
	
	public static void main(Integer i) {
		
		System.out.println("IntegerMainMethod");
	}
	
	
	int a=4;
	
	
	public static void main(String[] args) {
		System.out.println("MainMethod");
		ForOverrridingMainMethod.main("112");
		ForOverrridingMainMethod.main(25);

	}

}
