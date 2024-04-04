class Solution {
    public boolean isAnagram(String s, String t) {
        int sMap[] = new int[26];
        Arrays.fill(sMap,0);
        for (int i = 0; i < s.length(); i++){
            sMap[s.charAt(i)-97] ++;
        }
        for (int j = 0; j < t.length(); j++){
            sMap[t.charAt(j)-97] --;
        }
        for (int k : sMap){
            if (k != 0)
                return false;
        }
        return true;
    }
}
