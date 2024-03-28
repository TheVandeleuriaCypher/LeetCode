class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int dif = 0;
        for (int i: prices){
            if (i < min){
                min = i;
            } else if (dif < (i - min)){
                dif = i - min;
            }
        }
        return dif;
    }
}
