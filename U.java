import java.util.*;
import java.io.*;
class U{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s = br.readLine();
String[] s1 = s.split(" ");
n=Integer.parseInt(s1[0]);
d=Integer.parseInt(s1[1]);
String s2 = br.readLine();
String[] s3 = s2.split(" ");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s3[i]);
}
int number,diff=0;
int count=0;
int count2=0;
int num;
for(int i=0;i<n;i++){
if(arr[i]<d){
num =arr[i];
System.out.println(num);
n= arr[i];
number= arr[i];
while (n != 0) { 
n = n / 10; 
count++; 
} 
//if(count>1){

int arr2[] = new int[count];
for(int j=0;j<count;j++){
while(number>0){
arr2[j]= number%10;
number= number/10;
break;
}
}

for(int j=0;j<count-1;j++){
diff = Math.abs(arr2[j] - arr2[j+1]);
            
if(diff==1)
count2++;

}
if(count2==count-1)
System.out.print(arr[i]+" ");
arr2=null;
}
}
System.out.print("\n");
}
}
}
 
