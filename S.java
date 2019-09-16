import java.util.*;
import java.io.*;
class S{
public static void main(String[] args) throws IOExcetion{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readline());
for(int k=0;k<t;k++){
String a = br.readLine();
String[] b = a.split(" ");
n= Integer.parseInt(b[0]);
d= Integer.parseInt(b[1]); 
String a1 = br.readLine();
String[] b1 = a1.split(" ");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(b1[i]);
}

for(int i=0;i<n;i++){
int start= i;
sum=sum+arr[i];
if(sum>d)





}
}
}
