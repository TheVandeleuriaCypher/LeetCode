class Solution {
    public int removeDuplicates(int[] nums) {
        int returnArray[] = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if ((k == 0) || (nums[i]) != returnArray[k-1]){
                returnArray[k] = nums[i];
                k ++;
            }
        }
        int temp = k;
        while (temp < nums.length){
            nums[temp] = 0;
            temp ++;
        }
        for (int j = 0; j < nums.length; j ++)
            nums[j] = returnArray[j];
        return k;
    }
}
