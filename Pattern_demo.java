package program;

import java.util.Scanner;
public class Pattern_demo{

	public static void main(String[] args){
		Pattern_demo ob = new Pattern_demo();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=1; i<=input; i++){
			for(int j=1; j<=i;j++){
				System.out.println(i);
			}
		}
		System.out.println("");

	}
}