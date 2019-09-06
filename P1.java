import java.util.*;
import java.io.*;
class P1{
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
int max; int a=0; int b=0;
for(int i=0;i<n;i++){
max=arr[i];
for(int j=i;j<d+i && j<n;j++){
if(arr[j]>max){
max = arr[j];

}

}
System.out.print(max+" ");
for(int j=i;j<d+i+1&& j<n;j++){
if(arr[j]<max){
max=arr[i]
//b= arr[i];
}
}
System.out.print(max+" ");
}
System.out.print("\n");
}
}
}