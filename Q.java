import java.util.*;
import java.io.*;
class Q{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n = Integer.parseInt(br.readLine());
int arr[] = new int[n];
String s = br.readLine();
String[] s1 = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s1[i]);
}
int count=0;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
for(int m=0;m<n;m++){
if((Math.pow(arr[i], 2))+(Math.pow(arr[j],2))==(Math.pow(arr[k], 2)));
{
count++;
}
}
}
} 
if(count>=1){
System.out.print("Yes");
}
else if(count<1){
System.out.print("No");
}
count=0;
System.out.print("\n");
}
}
}