import java.util.*;
import java.io.*;
class P{
public static void main(String[] args) throws IOException{
int t; int n;int d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s = br.readLine();
String[] str=s.split(" ");
n=Integer.parseInt(str[0]);
d=Integer.parseInt(str[1]); 
int arr[]= new int[n];
String s2 = br.readLine();
String[] s12 = s2.split(" ");
for(int i=0;i<n;i++)
{
    arr[i]=Integer.parseInt(s12[i]);
 
}

 
int a=0;
int max= arr[0];
for(int i=1;i<d;i++){
if(arr[i]>max){
max = arr[i];
a=i;
}
}

System.out.println(a);
int b,c;
for(int i=a+1;i<n;i++){
if(arr[a]>arr[i]){
b= arr[a];
System.out.print(b+" ");
}
else if(arr[a]<arr[i]){
c= arr[i];
arr[a]=arr[i];
System.out.print(c+" ");
}}

System.out.print("\n");
}
}
}
