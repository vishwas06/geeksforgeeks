//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
     static int lowerBound(int arr[], int m, int x){
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
            
        }
        
        return ans;
    } 
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max=0;
        int row=-1;
        for(int i=0; i<n; i++){
            int count=m-lowerBound(arr[i], m, 1);
             if(count>max){
                max = count;
                row=i;
             }
        }
        return row;
    }
}