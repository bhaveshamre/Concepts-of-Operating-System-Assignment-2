package in.acts.cdac;

public class Vehicle {
	
	private static int feature(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
	
	private static float feature(float n1, int n2, int n3) {
		float r = n1 + n2 + n3;
		return r;
	}
	private static int feature(int n1, int n2, float n3, double n4) {
		return  (n1 + n2 + (int)n3 + (int)n4);
		
	}
     
	public static void main(String[] args) {
		System.out.println("Features : " + feature(80,20));
		
		System.out.println("Features : " + feature(80.8f,20,80));
		
		System.out.println("Features : " + feature(80,20,20.55f,20.25d));

	}

}
