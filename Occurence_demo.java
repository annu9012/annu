import java.util.LinkedHashSet;

public class Occurence_demo{

public void getcount(){
LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
String s= "abbcbcd";
char a[] =s.toCharArray();
int size = a.length-1;
for(int i=0; i<=size; i++){
hs.add(a[i]);
}
for(Character dd:hs) {
int count=0;
for(Character dd1:a){
if(dd==dd1){
count++;
}

}System.out.println(dd + " " + count);
}

}

public static void main(String[] args){
Occurence_demo ob = new Occurence_demo();
ob.getcount();
}
}