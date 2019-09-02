import java.util.*;
import java.io.*;
class D{
public static void main(String[] args){
int t, d, n;
BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));

t=Integer.parseInt(inp.readLine());
for(int k=0;k<t;k++){
n=Integer.parseInt(inp.readLine());
int arr[]= new int[n];
String s =inp.readLine();
String[] s1=s.split(" ");
for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(s1[i]);
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){

if(arr[i]>arr[j])
{if(j==n-1){
System.out.print(arr[i]+" ");
}
}
}
}
}
}
}


