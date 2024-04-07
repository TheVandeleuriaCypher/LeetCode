class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();

        if (nums.length == 0)
            return list;
        String newS = Integer.toString(nums[0]);
        for (int i = 0; i < nums.length; i ++){
            int dif = 0;
            int next = 0;
            if (i > 0)
                dif = nums[i] - nums[i-1];
            if (i < nums.length - 1)
                next = nums[i+1] - nums[i];

            if ((dif != 1)&&(next == 1)){
                newS = Integer.toString(nums[i]);
            }
            if ((dif == 1)&&(next != 1)){
                newS = newS + "->" + nums[i];
                list.add(newS);
                if (i < nums.length - 1)
                    newS = Integer.toString(nums[i+1]);
                else
                    newS = "";
            }
            if((dif != 1) &&(next != 1)){
                list.add(Integer.toString(nums[i]));
            }
        }
        return list;
    }
}
