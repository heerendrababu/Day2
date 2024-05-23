package com.kmss.practice;

import java.util.Scanner;

public class ArithmeticOperators
{
	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("enter first value: ");
         int num1 = sc.nextInt();
         System.out.println("enter second value: ");
         int num2 = sc.nextInt();
         System.out.println("enter character: '+' or '-' or '*' or' / ");
         char sym = sc.next().charAt(0);
         int i =  method(num1,num2,sym);
         System.out.println("Result is : "+i);
        
	}
	public static int method(int a,int b,char sym)
	{
	   switch(sym)
	   {
	   case '+':
	     return a+b;
	    
	   case '-':
		 return a-b;
	
	   case '*':
		   return a*b;
	
	   case '/':
		   return a/b;
		   
	   default:
		   System.out.println("invalid symbol");
	   return 0;
	   
	   }
	}
 }

