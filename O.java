import java.util.*;
import java.io.*;
class O{
public static void main(String[] args) throws IOException{
int n;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

n= Integer.parseInt(br.readLine());
int arr[] = new int[n];
String s = br.readLine();
String[] s1 = s.split(" ");
for(int i=0;i<n;i++){
arr[i] = Integer.parseInt(s1[i]);
}

int sum=0;

for(int i=0;i<n;i++){
sum = sum+arr[i];
}
System.out.println(sum);
}
}

 