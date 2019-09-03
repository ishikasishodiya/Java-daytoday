import java.util.*;
import java.io.*;
class N1{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n=Integer.parseInt(br.readLine());
String s = br.readLine();
String[] s1 = s.split(" ");
int arr[] = new int[n]; 
String[] s3=new String[]{""};//initializing
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s1[i]);
}
String aa="";  //initializing
for(int i=0;i<n;i++){
switch(arr[i]){
case 2:
String a2= "abc";
aa = aa + a2;
 s3 = aa.split("(?>3)");
break;
case 3:
String a3= "def";
aa = aa + a3;
break;
case 4:
String a4= "ghi";
aa = aa + a4;
break;
case 5:
String a5= "jkl";
aa = aa + a5;
 s3 = aa.split("(?>3)");
break;
case 6:
String a6= "mno";
aa = aa + a6;
break;
case 7:
String a7= "pqra";
aa = aa + a7;
break;
case 8:
String a8= "tuv";
aa = aa + a8;
break;
case 9:
String a9= "wxyz";
aa = aa + a9;
break;
default :
break;
}

}
System.out.println(Arrays.toString(s3));


}
}
}