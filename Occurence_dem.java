package program;

import java.util.LinkedHashSet;

public class Occurence_dem {

	public void getcountsting() {
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		String s = "shivamsharma";
		char a[]= s.toCharArray();
		int size = a.length-1;
		
		for(int i=0; i<=size;i++) {
			hs.add(a[i]);
		}
	
		for(Character dd:hs) {
			int count =0;
			for(Character dd1: a) {
				if(dd==dd1) {
					count++ ;
				}
			}System.out.println(dd + " " +count);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Occurence_dem ob = new Occurence_dem();
		ob.getcountsting();
	}
}
