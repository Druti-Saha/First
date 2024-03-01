//Question:  Horse Ros
 
import java.io.*;
 
import java.util.*;
 
import java.text.*;
 
import java.math.*;
 
import java.util.regex.*;
// Class name should be "Source",
 
// otherwise solution won't be accepted
 
class HorseRos {

 
    public static int distance(String w, String w1) {
 
        int m = w.length();
 
        int n = w1.length();
 
        int[][] dp = new int[m+1][n+1];
 
        for (int i = 0; i <= m; i++) {
 
            for (int j = 0; j <= n; j++) {
 
                if (i == 0) {
 
                    dp[i][j] = j;
 
                } else if (j == 0) {
 
                    dp[i][j] = i;
 
                } else if (w.charAt(i-1) == w1.charAt(j-1)) {
 
                    dp[i][j] = dp[i-1][j-1];
 
                } else {
 
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
 
                }
 
            }
 
        }
 
        return dp[m][n];
 
    }
 
    public static void main(String[] args) {
 
        String w = "druti";
 
        String w1 = "ruti";
 
        int minOperations = distance(w, w1);
 
        System.out.println("Minimum operations required: " + minOperations);
 
    }
 
}
