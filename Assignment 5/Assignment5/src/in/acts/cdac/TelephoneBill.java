package in.acts.cdac;

import java.util.Scanner;

public class TelephoneBill {
	private int noofCalls;
	private int durationofCalls;
	
	public TelephoneBill(int noofCalls,int durationofCalls) {
		this.noofCalls =noofCalls;
	    this.durationofCalls=durationofCalls;
	}
	
	public int Program(){
		int result = 0;
		if(noofCalls <= 100) {
			result = noofCalls * (50);
		}else if (noofCalls > 100) {
			result = noofCalls * (25);
		}
		return result;
	}
	public int Program1(){
		int result1 =0;
		result1 = durationofCalls/noofCalls;
		if ( result1 >= 1) {
			result1 = 1;
		}else {
			result1 = 1;
		}
		
		return result1;
	}

	public static void main(String[] args) {
		String Customer_name = "Amol D Amre";
		String Phone_No = "7506222506";
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Call :");
		int noofCalls =sc.nextInt();
		System.out.println("Duration of Call :");
		int durationofCalls =sc.nextInt();
		
      TelephoneBill t = new TelephoneBill(noofCalls, durationofCalls);
	
	int Charges = t.Program();
	int Duration = t.Program1();
	
	System.out.println(Customer_name);
	System.out.println(Phone_No);
	System.out.println("Bill Amount :"+Charges);
	System.out.println("Call Duration :"+Duration);
	System.out.println("There is a flat rate of $10 per month for all customers.");
	}

}
