class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int returnArray[] = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < m) && (j < n)){
            if (nums1[i] < nums2[j]){
                returnArray[k] = nums1[i];
                i ++;
            } else{
                returnArray[k] = nums2[j];
                j ++;
            }
            k ++;
        }

        while (i < m){
            returnArray[k] = nums1[i];
            i ++;
            k ++;
        }
        while (j < n){
            returnArray[k] = nums2[j];
            j ++;
            k ++;
        }

        for (int p = 0; p < (m+n); p ++){
            nums1[p] = returnArray[p];
        }
    }
}
