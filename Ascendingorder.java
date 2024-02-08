package program;

import java.util.Scanner;

public class Ascendingorder {

	public void getdata(int a[])
	{
	   for(int i=0; i<=4; i++)
		{
			
			for(int j=i+1; j<=4; j++)
			{
				
				if (a[i]>a[j])
				{
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				}
			}
		}
		System.out.println("scond highest number is"+a[3]);
			
				for(int k=0; k<=4; k++)
				{
					System.out.println(a[k]);
					
				}
	}


public static void main (String [] args)
{
	Ascendingorder ob=new Ascendingorder();
	Scanner sc=new Scanner (System.in);
	System.out.println("enter 5 numbers");
	int a[]= new int [5] ;
	for (int i=0; i<=4; i++)
	{
		a[i]=sc.nextInt();
		
	}
	
	ob.getdata(a);
	sc.close();
}
}

