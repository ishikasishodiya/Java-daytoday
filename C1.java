import java.util.*;
import java.io.*;  // ye imp hai in bufferreader
class C1
 {
public static void main (String[] args) throws Exception
 {
BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
int t;
  t=Integer.parseInt(inp.readLine());
  //since bufferreader take input in string format
  
for(int k=0;k<t;k++){
          //so we have to convert it to int. (inp.readLine()- means isko convert karna hai)
 


int arr[] = new int[n];

String s= inp.readLine();

 String[] s1 = s.split(" ");

//for array we cant do directly as buffer ek saath read karega array k elements ko as one string so we have to split
    for(int i=0;i<n;i++)
{
     arr[i]=Integer.parseInt(s1[i]);
 //yahan s1 ko convert karna hai to int
}

 
for(int i=d;i<n;i++)
{
 System.out.print(arr[i]+" ");

 }
 for(int i=0;i<d;i++)
{
 System.out.print(arr[i]+" ");
 
}

 System.out.print("\n");


} 
	 }
     }