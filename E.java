import java.util.*;

import java.lang.*;

import java.io.*;

class E {

public static void main (String[] args)
	
 {

 int t,n,m;

Scanner sc = new Scanner(System.in);

t=sc.nextInt();


for(int k=0;k<t;k++){

n=sc.nextInt();

int arr[]= new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}

for(int i=n-1;i>=0;i--){

    System.out.print(arr[i]+" ");

}
System.out.print("\n");


	 }

}
}