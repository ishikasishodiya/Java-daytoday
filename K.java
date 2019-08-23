/*choclate distri */
import java.util.*;
import java.io.*;
class K{
public static void main(String[] args) throws IOException{
int t,n,m,data[],index=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t = Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n= Integer.parseInt(br.readLine());
int arr[]= new int[n];
String s =br.readLine();
String[] s1 = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s1[i]);
}
m= Integer.parseInt(br.readLine());
Arrays.sort(arr);
int cdis=100000;
int dis=0;
for(int i=0;i<=n-m;i++){
 dis = Math.abs(arr[i]-arr[i+m-1]);
System.out.println(dis);
if(dis<=cdis)
{
cdis=dis;
}
}
System.out.println(dis);

}
}
}
