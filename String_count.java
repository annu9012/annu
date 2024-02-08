package program;

import java.util.Scanner;
public class String_count{

public void getcount(String input){
String a[] = input.split(" ");
int size = a.length-1;
int count =0;
for(int i=0;i<=size; i++){
count++;
}
System.out.println(count);
}


public static void main(String[] args){
String_count ob = new String_count();
Scanner sc = new Scanner (System.in);
String input= sc.nextLine();
ob.getcount(input);

}}