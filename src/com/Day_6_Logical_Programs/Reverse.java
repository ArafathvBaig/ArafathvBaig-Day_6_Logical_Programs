package com.Day_6_Logical_Programs;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int r;
		int rev=0;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println("The Reverse of the Number is: "+rev);
	}
}
