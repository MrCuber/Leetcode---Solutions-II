class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange) {
            int temp = numBottles/numExchange;
            int flag = numBottles%numExchange;
            ans = ans + temp;
            numBottles = temp + flag;
        }
        return ans;
    }
}