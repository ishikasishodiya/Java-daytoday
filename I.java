/*closest number*/
import java.util.*;
import java.io.*;
class I{
public static void main(String[] args) throws IOException{
int t,n,d;
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
int a=0;
int cdis=Math.abs(arr[0]-d);
for(int i=0;i<n;i++){
int distance=Math.abs(arr[i]-d);           
if(distance<=cdis)
{
a=arr[i];
cdis= distance;
}


}

System.out.println(a);





}
}
}
