import java.util.*;
import java.io.*;
import java.lang.*;
class M{
public static void main(String[] args) throws IOException{
int t;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s1 = br.readLine();
String s2 = br.readLine();
StringBuffer sb1 = new StringBuffer(s1.replace(" "," "));  //deleteCharAt is used with StringBuffer only.
StringBuffer sb2 = new StringBuffer(s2.replace(" "," "));
int a=0;
for(int i=0;i<sb1.length();i++){
for(int j=0;j<sb2.length();j++){
if(sb1.charAt(i)== sb2.charAt(j)){
String x = Character.toString(sb1.charAt(i));
String y = Character.toString(sb2.charAt(j));
  
  //char x=sb1.charAt(i);
//char y=sb2.charAt(i);
int x1=sb1.indexOf(x,i);
int y1=sb2.indexOf(y,j);
if(x1>-1){
sb1.deleteCharAt(x1+i);
}
if(y1>-1){
sb2.deleteCharAt(y1+j);
}
sb1.deleteCharAt(i);
sb2.deleteCharAt(j);

}
}
}

StringBuffer b = new StringBuffer(100);
b.append(sb1).append(sb2);
System.out.println(b.toString());
}
}
}
