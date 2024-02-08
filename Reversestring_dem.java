package program;

import java.util.Scanner;

public class Reversestring_dem{

	public void getreversestring(String input){
		char a[] = input.toCharArray();
		int size = a.length;
		String out ="";
		for(int i=size; i>=0; i--){
			out =out+a[i];
		}
		System.out.println("Reverse string is " +out);

		if(out.equalsIgnoreCase(input)){
			System.out.println(out + "is pallandrome");
		}
		else{
			System.out.println(out +" is not pallandrome" );
		}
	}

	public static void main (String[] args){
		Reversestring_dem ob = new Reversestring_dem();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		ob.getreversestring(input);
	}
}

