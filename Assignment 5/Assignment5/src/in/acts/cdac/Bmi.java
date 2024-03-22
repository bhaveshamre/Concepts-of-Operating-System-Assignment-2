package in.acts.cdac;

import java.util.Scanner;

public class Bmi {
	private double height;
	private double weight;
	
	public Bmi(double height, double weight){
		this.height=height;	
		this.weight=weight;
	}
	
	public double getHeight(){
		return this.height;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	
    public double BmiCalculator() {
    	double result= weight/(height*height);
    	return result;
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height in meters :");
		double height = sc.nextDouble();
		System.out.println("Enter Weight in meters :");
		double weight = sc.nextDouble();
		
		Bmi c = new Bmi(height, weight);
		
		double ans = c.BmiCalculator();
		
		System.out.println("Bmi Score :"+ans);
		
	}

}
