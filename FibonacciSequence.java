package com.kmss.practice;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) 
	{
		   Scanner sc  = new Scanner(System.in);
		   System.out.println("Enter nth value");
		   int n = sc.nextInt();
		   getSeries(n); 

		}
	 public  static int getSeries(int n)
	 {
	 // initializing first two variables with 0 and 1 then after next element will be addition of these two numbers then cntinues until 'n'
		 int x = 0;
		 int y = 1;
		 int temp = 0;
		 System.out.print(x+",");
		 System.out.print(y+",");
		 for(int i=1;i<=n;i++)
		 {
			temp = y+x;
			 x = y ;
			 y = temp;
			 System.out.print(temp+",");
		 }
		return temp;
		 
		 
	 }

}

