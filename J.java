import java.util.*;
import java.io.*;

public class J{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n= Integer.parseInt(br.readLine());
int arr[]= new int[n];
String s = br.readLine();
String[] str = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(str[i]);
}
int temp;
Arrays.sort(arr);
 for(int i=0;i<n/2;i++){
temp =arr[i];
arr[i]= arr[n-i-1];
arr[n-i-1]=temp;
}
for(int i=0;i<n;i++){
 
if(arr[i]%2!=0){
String a = Integer.toString(arr[i]);
System.out.print(a+" ");
}
}
Arrays.sort(arr);
for(int i=0;i<n;i++){
if(arr[i]%2==0){
String a = Integer.toString(arr[i]);
System.out.print(a+" ");
}
}






}
}
}