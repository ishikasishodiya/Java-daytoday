/*Print an array in Pendulum Arrangement
this one is a temp solutn*/

import java.util.*;
import java.io.*;
class H{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t=Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
int temp;
n= Integer.parseInt(br.readLine());
int arr[] = new int[n];//System.out.print(n);
String s= br.readLine();

 String[] s2 = s.split(" ");

 for(int i=0;i<n;i++)
{
    arr[i]=Integer.parseInt(s2[i]);
 
}

 

for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){

if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
 /*for(int i=0;i<n;i++){
System.out.print(arr[i]);
} 
 System.out.print("\n");*/
if(n%2!=0){
temp=arr[n/2];
arr[n/2]=arr[n-1];
arr[n-1]=temp;
/*for(int i=0;i<n;i++){
System.out.print(arr[i]);
} 
 System.out.print("\n"); */
for(int i=0;i<n/2;i++){
for(int j=i+1;j<n/2;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<n/2;i++){
System.out.print(arr[i]+" ");
}

for(int i=(n/2)+1;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=(n/2)+1;i<0;i++){
System.out.print(arr[i]+" ");
}
}
else if(n%2==0){
temp=arr[(n-1)/2];
arr[(n-1)/2]=arr[n-1];
arr[n-1]=temp;
/*for(int i=0;i<n;i++){
System.out.print(arr[i]);
} */
 System.out.print("\n");
for(int i=0;i<(n-1)/2;i++){
for(int j=i+1;j<(n-1)/2;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<(n-1)/2;i++){
System.out.print(arr[i]+" ");
}

for(int i=((n-1)/2)+1;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=((n-1)/2)+1;i<0;i++){
System.out.print(arr[i]+" ");
} 
}



}
}
}
