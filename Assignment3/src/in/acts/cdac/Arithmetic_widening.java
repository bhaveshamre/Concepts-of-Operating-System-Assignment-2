package in.acts.cdac;

public class Arithmetic_widening {

	public static void main(String[] args) {
		int a = 70 ;
		double b = 10.55 ;
		float c = 10.05f ;
		
		double sum1 = a * b;
		float div2 = a / c;
		
		System.out.println("Sum1::"+sum1);
		System.out.println("Div2::"+div2);

		double add1 = a + b;
		float sub2 = a - c;
		
		System.out.println("Add1::"+add1);
		System.out.println("Sub2::"+sub2);

		
		
	}

}
