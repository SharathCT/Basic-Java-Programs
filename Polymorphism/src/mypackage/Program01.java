package mypackage;

public class Program01 {
	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		
		return a+b+c;
	}
	
	

	public static void main(String[] args) {
	
		Program01 p=new Program01();
		
		System.out.println(p.add(1, 2));
		System.out.println(p.add(2, 5, 1));

	}

}
