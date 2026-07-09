// Last updated: 7/9/2026, 3:13:45 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        
        return helper(word1,word2,m,n,dp);
        
    }
    int helper(String str1,String str2,int m,int n,int[][] dp){
        if(m==0) return n;
        if(n==0) return m;
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return 0+helper(str1,str2,m-1,n-1,dp);
        }
        int x=1+helper(str1,str2,m-1,n,dp);
        int y=1+helper(str1,str2,m-1,n-1,dp);
        int z=1+helper(str1,str2,m,n-1,dp);
        return dp[m][n]=Math.min(x,Math.min(y,z));
        
    }
}