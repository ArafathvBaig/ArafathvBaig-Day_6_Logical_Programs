package com.Day_6_Logical_Programs;

import java.util.Scanner;

public class Fibonacci 
{
	public static void fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int count;
		System.out.println("The Fibonacci series for Number "+n+" is: ");
		System.out.print(+n1+" "+n2+" ");
		for(int i=3; i<=n; i++)
		{
			count=n1+n2;
			n1=n2;
			n2=count;
			System.out.print(+count+" ");
		}
		
		
	}

	public static void main(String[] args) 
	{
		fibonacci();

	}

}
