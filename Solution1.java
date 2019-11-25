import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the minimumLoss function below.
    static long minimumLoss(long[] price) {
       long result=Long.MAX_VALUE;
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

        long [] price = new long[n];

        String[] priceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            Long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }

       long result = minimumLoss(price);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
