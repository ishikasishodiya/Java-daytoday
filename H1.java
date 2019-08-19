import java.util.*;
import java.io.*;
class H1{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
int temp;
n= Integer.parseInt(br.readLine());
int arr[] = new int[n];
String s = br.readLine();
String[] str = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(str[i]);
}
 int min = arr[0];
	       int ind=0;

	       for(int m = 0; m < n; m++)
	       {
	            if(min > arr[m])
	            {
	                min = arr[m];
	                ind=m;
	            }
	        }


if(n%2!=0){
temp=arr[n/2];
arr[n/2]=arr[ind];
arr[ind]=temp;
/* for(int i=0;i<n;i++){
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
System.out.print(arr[n/2]+" ");
for(int i=(n/2)+1;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=(n/2)+1;i<n;i++){
System.out.print(arr[i]+" ");
}
}
else if(n%2==0){
temp=arr[(n-1)/2];
arr[(n-1)/2]=arr[ind];
arr[ind]=temp;
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
System.out.print(arr[(n-1)/2]+" ");
for(int i=((n-1)/2)+1;i<n;i++){
for(int j=i+1;j<n;j++){
if(arr[i]<arr[j]){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=((n-1)/2)+1;i<n;i++){
System.out.print(arr[i]+" ");
} 
}
System.out.print("\n");



}
}
}
