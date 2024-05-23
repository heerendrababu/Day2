package com.kmss.practice;

import java.util.Scanner;

public class CompareTwoStrings 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1st  string");
       String s = sc.next();
       System.out.println("enter 2nd string");
       String s1 = sc.next();
       String result = stringCompare(s,s1);
      
	}
	
	public static String stringCompare(String s,String s1)
	{
	  if(s.equals(s1))
	  {
		  System.out.println("Two strings are same content");
	  }
	  else
	  
		  System.out.println("Two strings are not same");
	  
	
	return "hhi";
 }
}