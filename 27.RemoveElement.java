class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int returnArray[] = new int[l];
        int k = 0;
        int found = 0;

        for (int i : nums){
            if (i != val){
                returnArray[k] = i;
                k ++;
                found ++;
            }
        }

        while (k < l){
            returnArray[k] = 0;
            k ++;
        }

        for (int j = 0; j < l; j++){
            nums[j] = returnArray[j];
        }
        return found;
    }
}
