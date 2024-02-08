package program;
public class Alpha_numeric_count{

public void get_count(){

String s= "abcd1653mn";
char a[] =s.toCharArray();
int size= a.length-1;
int sum=0;

for(int i=0; i<=size; i++){
if(Character.isDigit(a[i])){
String b=Character.toString(a[i]);
int d= Integer.parseInt(b);
sum=sum+d;

}
}System.out.println(sum);
}

public static void main(String[] args){
Alpha_numeric_count ob = new Alpha_numeric_count();
ob.get_count();
}
}