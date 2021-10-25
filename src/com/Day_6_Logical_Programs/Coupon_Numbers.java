package com.Day_6_Logical_Programs;

import java.util.Scanner;

public class Coupon_Numbers 
{
	public static void main(String[] args)
	{
		int randomCoupon;
		int couponCount=0;
		int randomCount=0;
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Coupons You Want: ");
		int n=sc.nextInt();
		int l=String.valueOf(n).length();
		int distinctArray[] =new int[n];
		while((couponCount<=n) && (j<n))
		{
			int flag=0;
			randomCoupon = ((int)((Math.random())*(int)(Math.pow(10, l)))%n)+1;
			System.out.println("Random is:"+randomCoupon);
			randomCount=randomCount+1;
			for(int i=0; i<n; i++)
			{
				if(distinctArray[i]==randomCoupon)
				{
					flag=flag+1;
					System.out.println("Flag: "+flag);
					break;
				}
				else
				{
					flag=flag;
					System.out.println("Flag: "+flag);
				}
			}
			if(flag==0)
			{
				distinctArray[j]=randomCoupon;
				System.out.println("Added Coupon is: "+distinctArray[j]);
				j++;
				couponCount=couponCount+1;
				System.out.println("Coupon Count is : "+couponCount);
			}
		}
		System.out.println("No.of Randoms Generated: "+randomCount);
		System.out.println("Distinct Coupons: ");
		for(int k=0; k<n; k++)
		{
			System.out.println(distinctArray[k]);
		}
	}
}
