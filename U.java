import java.util.*;
import java.io.*;
class U{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s = br.readLine();
String[] s1 = s.split(" ");
n=Integer.parseInt(s1[0]);
d=Integer.parseInt(s1[1]);
String s2 = br.readLine();
String[] s3 = s2.split(" ");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s3[i]);
}
int a=0; int b=0; int c=0; int m=0; int diff=0;
for(int i=0;i<n;i++){
if(arr[i]<d){
 while (arr[i] != 0) 
    { 
    a=arr[i]%10;
     
    } 
}
if(Math.abs(diff)==1){
m=arr[i];
System.out.print(arr[i]+" ");
}
}
System.out.print("\n");
}
}
}
 
