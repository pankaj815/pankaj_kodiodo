package com.cjc;

import java.util.*;


public class Bank {
 
	public double balance=0;
	public double deposite;
	
	
	
	
	Scanner sc=new Scanner(System.in);
	
	 public void depositeMoney() 
	 { 
		 
		
	System.out.println("enter money to deposite");
	double deposite=sc.nextDouble();
	
	balance=balance+deposite;

	System.out.println("your current balance is = "+balance);
	 } 
	 
	 public static void main(String[] args) {
		
		 Bank b=new Bank();
		 
		 b.depositeMoney();
		 
		 
		 
	}

	
	
	
	
	
	
}
