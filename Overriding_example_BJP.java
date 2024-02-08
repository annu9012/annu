package program;

import java.util.Scanner;

class sp {
	public void getgst(float input) {
		float gst = (input*3)/100;
		System.out.println(gst);
	}
}

class Congress extends sp{
	public void getgst(float input) {
		float gst =(input*5)/100;
		System.out.println(gst);
	}
}
 
public class Overriding_example_BJP extends Congress{

		public void getgst(float input) {
			float gst = (input*18)/100;
			System.out.println(gst);
		}
	

	public static void main(String[] args) {
		Overriding_example_BJP ob = new Overriding_example_BJP();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		float input = sc.nextFloat();
		ob.getgst(input);
}
}