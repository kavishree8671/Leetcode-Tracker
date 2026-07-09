// Last updated: 7/9/2026, 3:11:35 PM
class Solution {
    public static int sumOfsquares (int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
     public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumOfsquares(slow);
            fast=sumOfsquares(sumOfsquares(fast));
        }while(slow!=fast);
        return slow==1?true:false;

    }
}