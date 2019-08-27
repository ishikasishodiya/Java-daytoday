import java.util.*;
/* find the fine 

 
*/

import java.io.*;
class L{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s= br.readLine();
String[] s1= s.split(" ");

n= Integer.parseInt(s1[0]);
d= Integer.parseInt(s1[1]);
int arr[] = new int[n];
String s2= br.readLine();
String[] s3= s2.split(" ");

for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(s3[i]);
}
int arr2[] = new int[n];
String s4= br.readLine();
String[] s5= s4.split(" ");
for(int i=0;i<n;i++){
arr2[i]=Integer.parseInt(s5[i]);
}
int a=0;
for(int i=0;i<n;i++){
if(d%2!=0){
if(arr[i]%2==0)
{
a= a+arr2[i];
}
}
else if(d%2==0){
if(arr[i]%2!=0)
{
a= a+arr2[i];
}
}
}
System.out.println(a);

}
}
}







