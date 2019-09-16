import java.util.*;
import java.io.*;
class S{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
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
int start;
int header=0;
int wsum=0;
int flag=0 ;// to check whether we have found the substring with given sum or not

for(int i=0;i<n;i++){
wsum= wsum +arr[i]; // this statement should be above while, test case disapproved
while(wsum>d){  // if se saare test case paas nhi hue
wsum= wsum - arr[header];
header++;
}
if(wsum ==d){
flag=1;

System.out.print(header+1 +" ");
System.out.print(i+1 +" ");
break;
}

}
if(flag==0)
{
System.out.print("-1");
}
System.out.print("\n");
}
}
}
