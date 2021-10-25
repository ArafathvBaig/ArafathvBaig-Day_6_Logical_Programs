package com.Day_6_Logical_Programs;

import java.util.Scanner;

public class Prime_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int flag=0;
		if((n<=0) || (n==1))
		{
			System.out.println(+n+" is not a Prime Number.");
		}
		else if(n==2)
		{
			System.out.println(+n+" is a Even Prime Number.");
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if((n%i)==0)
				{
					flag=flag+1;
				}
				else
				{
					flag=flag;
				}
			}
			if(flag==2)
			{
				System.out.println(+n+" is a Prime Number.");
			}
			else
			{
				System.out.println(+n+" is not a Prime Number.");
			}
		}
	}

}
