package com.kmss.practice;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number for factorial: ");
     int n = sc.nextInt();
     getFactorial(n);
	}
	public static int getFactorial(int n)
	{
		int fact =1;
// until n it will loop and multiply i value with previous 'factorial' result
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of "+n+" is: "+fact);
		return fact;
	}

}
