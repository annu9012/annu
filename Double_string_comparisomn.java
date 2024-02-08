package program;

import java.util.Scanner;

public class Double_string_comparisomn {

	public void getreversecomparisom( int a[]){
		for(int i=0; i<=4;i++) {
			for(int j=i+1;j<=4;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
		}
		for(int k=0;k<=4;k++) {
			System.out.println(a[k]);
		//35	System.out.println(a[k]-1+"Second maximum number");
		}
		System.out.println(a[0] +" is minimum");
		System.out.println(a[4] +" is max");
	
	}
	
	public static void main(String[] args) {
		Double_string_comparisomn ob = new Double_string_comparisomn();
		Scanner sc = new Scanner (System.in);
		int a[]= new int[5];
		for(int i=0;i<=4; i++) {
		 a[i] =sc.nextInt();}
		ob.getreversecomparisom(a);
		
		
	}
}
