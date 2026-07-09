// Last updated: 7/9/2026, 3:10:08 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(s,0,n-1,dp);
        
    }
    int helper(String s,int i,int j,int[][] dp) {
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) {
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)) {
            return 2 + helper(s,i+1,j-1,dp);
        }
        int ans1=helper(s,i+1,j,dp);
        int ans2=helper(s,i,j-1,dp);
        return dp[i][j]=Math.max(ans1,ans2);
    }
}