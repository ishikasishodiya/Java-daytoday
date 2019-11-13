import java.util.*;
import java.io.*;
class V{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s= br.readLine();
String[] s1 = s.split(" ");
n= Integer.parseInt(s1[0]);
d= Integer.parseInt(s1[1]);
String s2= br.readLine();
String[] s3= s2.split(" ");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s3[i]);
}
int n1,diff=0,num,count=0;
for(int i=0;i<n;i++){
if(arr[i]<d){
n1=arr[i];
num=arr[i];
while (n1 != 0) 
{ 
diff =Math.abs( (n1 % 10)-diff); 
 n1 = n1/10; 
        } 
     if(diff==1){
count++;
System.out.print(num+" ");
}
diff=0;
}

}
while(count==0){
System.out.print("-1");
}
System.out.print("\n");
}

}
}
