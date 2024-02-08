package program;

import java.util.Scanner;

public class Rev_integer {

	public void getdata(int input) {
		int reverse=0;
		while(input!=0) {
			int rem= input%10;
			reverse = reverse*10+ rem;
			input =input/10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[]args) {
		Rev_integer ob=new Rev_integer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		 int input=sc.nextInt();
		ob.getdata(input);
	}
}
