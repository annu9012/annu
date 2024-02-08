package program;

import java.util.Objects;
import java.util.Scanner;

public class Paragragh_words_count {  // split break string into array substring

	public void getstringcount(String input){

		String s[] =input.split("");
		 int count =0;
		for(String ss:s){
		count++ ;
		}
		System.out.println(count);
		}

		public static void main (String[] args){
		Paragragh_words_count ob = new Paragragh_words_count();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		ob.getstringcount(input);


		}}