package program;

public class Stringcount {

	public void getmethod() {
		String a= "ab6545b ,cdasdc";
	//	String a = b.split("")
		char c[]= a.toCharArray();
		int size = c.length-1;
		int count =0;
		int cons =0;
		int sum=0;
		for(int i=0; i<=size; i++) {
			if(c[i]=='a' ||c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u'  ) {
			   System.out.println("vowels " + " " + c[i]);
			   count++;
			   
			}
			

			
	else if (Character.isDigit(c[i])) {
				String data= Character.toString(c[i]);
				int num = Integer.parseInt(data);
				sum = sum +num;
			}
			else {
				System.out.println("consonent " +" " + c[i]);
				cons++;
			}
		}
		System.out.println("count no " +count);
		System.out.println("conso no " + cons);
		System.out.println("sum of int " + sum);
	}
	public static void main(String[] args) {
		Stringcount ob = new Stringcount();
		ob.getmethod();
	}
}
