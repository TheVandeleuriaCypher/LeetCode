class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        int k = nums[0];
        int votes = 0;
        for (int v: nums){
            if (v == k)
                votes ++;
            else{
                votes --;
                if (votes == 0){
                    votes ++;
                    k = v;
                }
            }

        }
        return k;
    }
}
