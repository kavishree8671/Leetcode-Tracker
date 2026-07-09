// Last updated: 7/9/2026, 3:08:05 PM
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD=empty/NE;
            drink+=newD;
            empty=(empty%NE)+newD;
        }
        return drink;
        
    }
}