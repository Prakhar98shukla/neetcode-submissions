class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int b=0,s=1;
        while(s<prices.length){
            if(max<(prices[s]-prices[b])){
                 max=prices[s]-prices[b];
            }
            else if(prices[s]<prices[b]){
                b=s;
            }
            s++;
        }
        return max;

    }
}
