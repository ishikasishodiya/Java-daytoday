import java.util.*;
import java.io.*;
public class T{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n=Integer.parseInt(br.readLine());
int arr[] = new int[n];
String s = br.readLine();
String[] s1 = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s1[i]);
}
int m=0;
int a=0;
int max=0;
int min=0;
int b=0;
for(int i=0;i<n;i++){
if(arr[a]<= arr[i]){
a=i;
}
 m = a;
max = arr[a];
if(arr[b]>=arr[i]){
b=i;
}
min= arr[b]; 
}
//System.out.print(min+" ");
System.out.print(max+" ");
if(arr[n-2]!=min && arr[1]!=min){
if(arr[n-1]==max){
System.out.print("1");
}
else if(arr[0]==max){
System.out.print("2");
}
else if(arr[m+1]> arr[m-1]){
System.out.print("3");
}
else if(arr[m+1]<arr[m-1]){
System.out.print("4");
}}
else if(arr[n-2]==min){
System.out.print("3");
}
else if(arr[1]==min){
System.out.print("4");
}
System.out.print("\n");
}
}
}