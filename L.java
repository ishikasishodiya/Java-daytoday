import java.util.*;
/* find the fine 
Given an array of penalties P, an array of car numbers C, and also the date D. The task is to find the total fine which will be collected on the given date. Fine is collected from odd-numbered cars on even dates and vice versa.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of three lines of input. First line of each test case contains two integers N & D, second line contains N space separated car numbers C and third line contains N space separated penalties P.

Output:
For each test case,In new line print the total fine.

Constraints:
1 <= T <= 100
1 <= N <= 105
1000 <= Ci <= 9999
1 <= D <= 31
1 <= Pi <= 103
Example:
Input:
2
4 12
2375 7682 2325 2352
250 500 350 200
3 8
2222 2223 2224
200 300 400
Output:
600
300

Explantion:
Testcase1: The date is 12 (even), so we collect the fine from odd numbered cars. The odd numbered cars and the fines associated with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600
 
*/

import java.io.*;
class L{
public static void main(String[] args) throws IOException{
int t,n,d;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
t= Integer.parseInt(br.readLine());
for(int k=0;k<t;k++){
String s= br.readLine();
String[] s1= s.split(" ");

n= Integer.parseInt(s1[0]);
d= Integer.parseInt(s1[1]);
int arr[] = new int[n];
String s2= br.readLine();
String[] s3= s2.split(" ");

for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(s3[i]);
}
int arr2[] = new int[n];
String s4= br.readLine();
String[] s5= s4.split(" ");
for(int i=0;i<n;i++){
arr2[i]=Integer.parseInt(s5[i]);
}
int a=0;
for(int i=0;i<n;i++){
if(d%2!=0){
if(arr[i]%2==0)
{
a= a+arr2[i];
}
}
else if(d%2==0){
if(arr[i]%2!=0)
{
a= a+arr2[i];
}
}
}
System.out.println(a);

}
}
}







