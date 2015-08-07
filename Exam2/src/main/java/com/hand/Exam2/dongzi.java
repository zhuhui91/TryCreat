package com.hand.Exam2;

import java.util.Scanner;

public class dongzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ct = 0;
		Scanner input=new Scanner(System.in);
	    System.out.println("请输入工资:");
	    double gz=input.nextDouble();
	   if(gz<=1500){
		   ct=gz*0.03;
	   }else if(gz>1500&&gz<=4500){
		   ct=gz*0.1;	   
	   }else if(gz>4500&&gz<=9000){
		   ct=gz*0.2;	   
	   }else if(gz>9000&&gz<=35000){
		   ct=gz*0.25;	   
	   }else if(gz>35000&&gz<=55000){
		   ct=gz*0.3;	   
	   }else if(gz>5500&&gz<=80000){
		   ct=gz*0.35;	   
	   }else if(gz>80000){
		   ct=gz*0.45;	   
	   }
	   
	   System.out.println("所需要缴纳的税费为:"+ct);		   
	}
}
