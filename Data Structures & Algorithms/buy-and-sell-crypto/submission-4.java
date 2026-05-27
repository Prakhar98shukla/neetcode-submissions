class Solution {
    public int maxProfit(int[] prices) {
       int i=0;
       int j=1;
       int res=0;
       while(j<prices.length){
        if(prices[i]>prices[j]){
            i++;
            j++;
        }
        else{
             res=Math.max(prices[j]-prices[i],res);
             j++;
        }
       }
       while(i<j){
        if(prices[i]<prices[j-1]){
        res=Math.max(prices[j-1]-prices[i],res);
        }
        i++;
       }
       return res;

    }
}
