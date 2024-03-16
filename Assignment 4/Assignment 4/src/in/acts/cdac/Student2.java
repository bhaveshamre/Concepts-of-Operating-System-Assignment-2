package in.acts.cdac;

import java.util.Scanner;

public class Student2 {
	private String name;
	private int rollno;
	private float marks;
	
	void getrecord(){
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Name     :");
		this.name=sc.nextLine();
		System.out.printf("Roll No. :");
		this.rollno=sc.nextInt();
		System.out.printf("Marks    :");
		this.marks=sc.nextFloat();
	}
	
	void printrecord(){
		System.out.printf("%-10s%-10d%-10.2f",name,rollno,marks);	}
	
	public static void main(String[] args) {
		
		Student2 s = new Student2();		
		s.getrecord();
		s.printrecord();
	}

}

