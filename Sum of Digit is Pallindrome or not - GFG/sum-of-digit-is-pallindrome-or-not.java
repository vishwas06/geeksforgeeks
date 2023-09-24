//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int sum=0;
        while(N!=0){
            int rem=N%10;
        sum+=rem;
            N=N/10;
        }
        int temp=sum;
        int palNum =0;
        while(sum!=0){
            int rem =sum%10;
            palNum = palNum*10+rem ;
         sum=sum/10;   
        }
        
        if(temp == palNum) {
        return 1;
        }else {
            return 0;
        }
    }
}