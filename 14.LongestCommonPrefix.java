class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        String common = "";
        for (int j = 0; j < first.length(); j ++){
            if ((j > last.length()-1) || (last.charAt(j) != first.charAt(j))){
                return common;
            } else{
                common = common + first.charAt(j);
            }
        }
        return common;
    }
}
