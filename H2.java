/* final solution executed */
import java.util.*;
import java.io.*;
class H2{
public static void main(String[] args) throws IOException{
int t,n;
BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
n= Integer.parseInt(br.readLine());
int arr[] = new int[n];
String s = br.readLine();
String[] str = s.split(" ");
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(str[i]);
}
Arrays.sort(arr);

String s1 = Integer.toString(arr[0]);
for(int i=1;i<n;i++){
if(i%2!=0){
String s2 =Integer.toString(arr[i]);
s1=s1+" "+s2;
}
else if(i%2==0){
String s2 =Integer.toString(arr[i]);
s1=s2+" "+s1;

}

}

System.out.println(s1);



}
}
}
