package in.acts.cdac;

import java.util.Scanner;

public class Bank {
private String name;
private int accountno;
private double balance;
private double d;
private double w;
private int yn;
private double bal;

public Bank() {
	this.name=name;
	this.balance=balance;
	this.accountno=accountno;
	this.d=d;
	this.w=w;
this.yn=yn;
this.bal=bal;
}
public double Deposit(double balance, double d) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Account Number :");
	int accountno = sc.nextInt();
	double result = balance + d;
	return result;
}
public double Withdraw(double balance,double w) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Account Number :");
	int accountno = sc.nextInt();
	double result1= balance - w;
	return result1; 
}
public double Balance(double balance,double d,double w,int yn) {
	Scanner sc = new Scanner(System.in);
	
	if (yn ==1) {
	System.out.println("Account Number :");
	int accountno = sc.nextInt();
	double res = balance + d - w;
	return res;}
	else {
		System.out.println("Invalid option.");
		return 0;
	}
}
public int Detailsinfo(double accountno,String name,double bal) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Account Number :");
	int a = 1;
	int accountn1 = sc.nextInt();
	if (accountn1 == accountno) {
		System.out.println("Account Holder Name :"+name);
		System.out.println("Balance Money :"+bal);
		return a;}
	else {System.out.println("Invalid option.");
	return 0;}
		
	
}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Holder Name :");
		String name = sc.nextLine();
		System.out.println("Account Number :");
		int accountno = sc.nextInt();
		double balance = 0;
		System.out.println("Account Balance :"+balance);
		Bank b = new Bank();
		System.out.println("Deposit Money :");
		double d = sc.nextDouble();
		double d1 = b.Deposit(balance,d);
		System.out.println("Deposit Money is "+d1);
		System.out.println("Withdraw Money :");
		double w = sc.nextDouble();
		double w1 = b.Withdraw(balance,w);
		System.out.println("Withdraw Money is "+w1);
		System.out.println("Account Balance (1)yes/2)no):");
		int yn = sc.nextInt();
		double bal=b.Balance(balance,d,w,yn);
		System.out.println("Balance Money is "+bal);
		System.out.println("Displyay Details 1)yes/2)no: ");
		int s = b.Detailsinfo(accountno,name,bal);


	}

}
