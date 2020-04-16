//worked code - in gfg useing hashset to remove duplicate items
import java.util.*;
import java.lang.*;

import java.io.*;

public class X2ss{
public static void main(String[] args) throws IOException{
int t;
int n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s1 = br.readLine();
String[] str1 = s1.split(" ");
n= Integer.parseInt(str1[0]);
d= Integer.parseInt(str1[1]);
int A[]= new int[n];
String s = br.readLine();
String[] str = s.split(" ");
for(int i=0;i<n;i++){
A[i]= Integer.parseInt(str[i]);
}            
List<Integer> l1 = new ArrayList<Integer>();

//j<n-d isliyekia coz j<n kia toh window aage tak chalijaegi, +1 isliye kia if only one element in array
for(int j=0;j<n-d+1;j++){

for (int i = j; i < d+j; i++)

{
    if(i<n)
    
l1.add(A[i]);

}



Collections.sort(l1);
//removing duplicate elements
LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(l1);
         
        ArrayList<Integer> l2= new ArrayList<>(hashSet);
System.out.print(l2.size()+" ");

l1.clear();

}
}
}
}
