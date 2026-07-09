// Last updated: 7/9/2026, 3:11:15 PM
class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<=nums.length;i++){
            xor=xor^i;
        }
        for(int x:nums){
            xor=xor^x;
        }
        return xor;
       
    }
}