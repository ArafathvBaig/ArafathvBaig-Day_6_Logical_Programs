package com.Day_6_Logical_Programs;

import java.util.Scanner;

public class StopWatch 
{
		public long startTimer=0;
		public long stopTimer=0;
		public long elapsed;
		public double t;
		void start()
		{
			startTimer=System.currentTimeMillis();
			System.out.println("Start Time is: "+startTimer);
		}	
		void stop()
		{
			stopTimer=System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTimer);
			elapsed=stopTimer-startTimer;
			//t=Math.Round(elapsed / 1000, 3);
			t=elapsed/1000.0;
			System.out.println("Total Time Elapsed(in millisec) is:"+elapsed);
			System.out.println("Converting millisec to seconds: "+t+" sec");
		}
	public static void main(String[] args) 
	{
		int start;
		int stop;
		StopWatch obj=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.print("Press '1' to Start Time: ");
		start=sc.nextInt();
		if(start==1)
		{
			obj.start();
			System.out.print("Press '2' to Stop Time: ");
			stop=sc.nextInt();
			if(stop==2)
			{
				obj.stop();
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}
