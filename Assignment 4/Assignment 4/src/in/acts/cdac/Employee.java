package in.acts.cdac;

public class Employee {

	private static float emp(float f, int g) {
		float r = f + g;
		return r;
	}
	
	private static void emp(float n1, int n2, double n3) {
		System.out.println("Float+Int+Double:"+n1+n2+n3);
		System.out.println("=======================================");
	}
	private static  void emp(int n1, String n2, float n3, double n4) {
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("=======================================");
	}
	public static void main (String[] args) {
		Employee e = new Employee();
	
        
	System.out.println(emp(10.70f,5));
	System.out.println("=======================================");
	
	e.emp(80.8f,20,80);
	
	e.emp(80,"Cdac Mumbai",20.55f,20.25d);
	}

}
