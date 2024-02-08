package program;

import java.util.Scanner;
public class Pallendrom_program{

public void get_pallandrome(String input){

char a[] = input.toCharArray();
int size= a.length-1;
String out="";
for(int i=size; i>=0; i--){
out = out+a[i];
}
System.out.println(out + "is a reversenumb");

if(out.equalsIgnoreCase(input)){
System.out.println(out + "is a pllandrome");
}
else{
System.out.println(out + "is not a pallandrome");
}
}

public static void main(String[] args){
Pallendrom_program ob = new Pallendrom_program();
Scanner sc = new Scanner(System.in);
String input = sc.next();
ob.get_pallandrome(input);
}
}