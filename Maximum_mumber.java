package program;

import java.util.Scanner;

public class Maximum_mumber {

	public void getmaxnumber(int a[]) {
		
		for(int i=0;i<=4;i++) {
			for(int j=i+1; j<=4;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
		/*for(int k=0;k<=4;k++) {
			System.out.println(a[k]);
		//35	System.out.println(a[k]-1+"Second maximum number");
		}*/
	
		System.out.println(a[0] +" miniimum number");

		System.out.println(a[3] +"Second maximum number");

		System.out.println(a[4] +" maximum number");
	}
	
	public static void main(String [] args) {
		Maximum_mumber ob = new Maximum_mumber();
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("please enter 5 Numbers");
	
		for(int i=0; i<=4; i++) {
			a[i]= sc.nextInt();
		}
		ob.getmaxnumber(a);
		}
	
}