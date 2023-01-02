package mypackage;

public class Program02 {

	public int myAdd(int k, int d, int p) {
		
		return k+d+p;
	}
	
	
	
	public double myAdd(double k, double l, double r) {
		
		return k+l+r;
	}
	

	public static void main(String[] args) {
	
		Program02 pl=new Program02();
		System.out.println(pl.myAdd(2, 3, 4));
		System.out.println(pl.myAdd(2, 3, 9));
		
		
		
		

	}

}
