 package program;

import java.util.Scanner;

public class ReverseString {

	public void getreversestring(String input) {
    
	String out ="";
	char a[] =input.toCharArray();
	int size = a.length-1;
	
	for(int i=size; i>=0; i--) {
		out=out+a[i];
	}
	System.out.println(out);
	}
	
	public static void main(String[] args) {
		ReverseString ob = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input =sc.next();
		ob.getreversestring(input);
	}
}
