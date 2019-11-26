import java.util.*;
import java.io.*;
class TEST1{
public static void main(String[] args) throws IOException{
int n;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
String s2 = br.readLine();
String[] s3 = s2.split(" ");
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]= Integer.parseInt(s3[i]);
}
int diff=Integer.MAX_VALUE;
for(ccc j=0;j<n-1;j++){
for(int k=j+1;k<n;k++){
if((arr[j]-arr[k])<diff && (arr[j]-arr[k])>0)
diff=arr[j]-arr[k];

}
}
System.out.println(diff);

}
}




static int minimumLoss(long[] price) {
        int result=Integer.MAX_VALUE;
for(long j=0;j<price.length-1;j++){
for(long k=j+1;k<price.length;k++){
if((price[j]-price[k])<result && (price[j]-price[k])>0)
result=price[j]-price[k];

}
}
return result;

    }




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumLoss function below.
    static long minimumLoss(long[] price) {
       int result=Integer.MAX_VALUE;
for(int j=0;j<price.length-1;j++){
for(int k=j+1;k<price.length;k++){
if((price[j]-price[k])<result && (price[j]-price[k])>0)
    result=price[j] - price[k];
}
}
return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] price = new long[n];

        String[] priceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }

        int result = minimumLoss(price);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
