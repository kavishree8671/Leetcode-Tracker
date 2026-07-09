// Last updated: 7/9/2026, 3:11:10 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int len=0;
        for(int x:nums){
            int i=Arrays.binarySearch(dp,0,len,x);
            if(i<0)i=-(i+1);
            dp[i]=x;
            if(i==len)len++;
        }
        return len;
    }
}