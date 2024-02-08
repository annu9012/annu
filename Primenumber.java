package program;

import java.util.Scanner;

public class Primenumber {

	public void getprimenum(int num)
	{
		//int flag=0;
		if (num==0|| num==1)
		{
			System.out.println(num+"number is not prime ");
		}
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
			//	flag=1;
				System.out.println(num+"number is not prime");
			} 
		
		//   if(flag==0)
		else
				{
					System.out.println(num+"number is prime");
					}
			}
	}
		public static void main (String [] args )
		{
		Primenumber ob =new Primenumber();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number");
		int input=sc.nextInt();
		ob.getprimenum(input);
		sc.close();
	}

}
