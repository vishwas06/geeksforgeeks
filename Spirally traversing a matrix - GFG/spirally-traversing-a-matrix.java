//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        //Printing top
        int top=0, right=c-1, left=0, bottom=r-1;
        
        while(left<=right && top<=bottom){
        for(int i=left; i<=right; i++){
            list.add(matrix[top][i]);
        }
        top++;
        
        for(int j=top; j<=bottom; j++){
            list.add(matrix[j][right]);
        }
        right--;
        if(top<=bottom){
        for(int k=right; k>=left; k--){
            list.add(matrix[bottom][k]);
        }
        bottom--;
        }
        if(left<=right){
        for(int l = bottom; l>=top; l--){
            list.add(matrix[l][left]);
        }
        left++;
        }
        }
        return list;
    }
}
