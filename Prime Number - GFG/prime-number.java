//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
    

    if (N <= 1) {
        return 0; // 0 and 1 are not prime numbers
    }

    if (N == 2) {
        return 1; // 2 is a prime number
    }

    if (N % 2 == 0) {
        return 0; // Even numbers (except 2) are not prime
    }

    for (int i = 3; i <= Math.sqrt(N); i += 2) {
        if (N % i == 0) {
            return 0; // N is divisible by a number other than 1 and itself
        }
    }

    return 1; // N is prime
}
    
}