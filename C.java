/*Given an unsorted array arr[] of size N, rotate it b D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of eacg test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output: 
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 10
Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/

import java.util.*;

import java.io.*;  // ye imp hai in bufferreader

class C
 
{
public static void main (String[] args) 

 {

BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));

int t,n,d;

  
  t=Integer.parseInt(inp.readLine());
  //since bufferreader take input in string format
  
for(int k=0;k<t;k++){
          //so we have to convert it to int. (inp.readLine()- means isko convert karna hai)
 n=Integer.parseInt(inp.readLine());

d=Integer.parseInt(inp.readLine());

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
