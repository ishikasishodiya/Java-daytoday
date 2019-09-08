import java.util.*;
import java.io.*;
class R{
public static void main(String[] args){
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
int a,b=0;
if(n==1){
    
System.out.print("1");
}
int sum1=0; int sum2=0; int c=0;
if(n>1){
for(int i=0;i<n;i++){
for(int j=0;j<i;j++){
sum1= sum1+arr[j];

}
//System.out.println("sum1 "+ sum1);
for(int m=i+1;m<n;m++){
sum2= sum2+arr[m];
}
//System.out.println("sum2 "+sum2);
if(sum1==sum2){
b++;
c=i;
}
sum1=0; sum2=0;
}

if(b==1){
System.out.print(c+1);
}
if(b!=1){
System.out.print("-1");
}
}
System.out.print("\n");
}
}
}
