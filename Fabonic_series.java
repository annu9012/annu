package program;

import java.util.Scanner;

public class Fabonic_series {

	public void getfabonicnumber() {
		
		int a=0;
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();

		System.out.println(a + " ");
		System.out.println(b + " "); 
		
		for(int i=2;i<=n;i++) {
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
	
	public static void main(String[] args) {
		Fabonic_series ob =new Fabonic_series();
		 ob.getfabonicnumber();
		 
		
	}
}
