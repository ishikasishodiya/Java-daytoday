/*Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements. The third line of each test case contains "d" .

Output:
Corresponding to each test case, in a new line, print the modified array.

Constraints:
1 = T = 200
1 = N = 200
1 = A[i] = 1000

Example:
Inp
1
5
1 2 3 4 5
2

Output
3 4 5 1 2
*\

import java.util.*;
class B{
public static void main(String[] args){
int t,n,m;
Scanner sc = new Scanner(System.in);
t=sc.nextInt();

for(int k=0;k<t;k++){
n=sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
m=sc.nextInt();
//int arr2[]= new int[n];
if(m>0){
for(int i=m;i<n;i++){
System.out.print(a[i]+" ");}
for(int j=0;j<m;j++){
System.out.print(a[j]+" ");


}
System.out.print("\n");
}
}
}
}
