import java.util.*;
import java.io.*;
class F{
public static void main(String[] args) throws IOException
{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t=Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s1 = br.readLine();
String[] str = s1.split(" ");
n= Integer.parseInt(str[0]);
d=Integer.parseInt(str[1]);
int arr[] = new int[n];//System.out.print(n);
String s= br.readLine();

 String[] s2 = s.split(" ");

 for(int i=0;i<n;i++)
{
    arr[i]=Integer.parseInt(s2[i]);
 
}

 
for(int j=0;j<n;j=j+d){
for(int i=j+d-1;i>=j;i--){  
if(i>n)
{
i=n-1;                                  //j=0  d=3 i=2
System.out.print(arr[i]+" ");          //j=3  d=3 i=5
}
else{
System.out.print(arr[i]+" ");          
}}
}
System.out.print("\n");
}
}
}