package com.kmss.practice;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter breadth: ");
     float f1= sc.nextFloat();
     System.out.println("enter height: ");
     float f2 = sc.nextFloat();
     float res =  area(f1,f2);
     System.out.println("Area of Traingle is: "+res);
      
	}
	
	public static float area(float b,float h)
	{
		float res = 0.5f*b*h;
		return res;
	}

}
