class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLetters[] = new int[26];
        int mLetters[] = new int[26];

        Arrays.fill(rLetters,0);
        Arrays.fill(mLetters,0);

        for (int i = 0; i < ransomNote.length();i++){
            rLetters[ransomNote.charAt(i)-97] ++;
        }
        for (int j = 0; j < magazine.length();j++){
            mLetters[magazine.charAt(j)-97] ++;
        }

        for (int k = 0; k < 26; k++){
            if (rLetters[k] > mLetters[k]){
                return false;
            }
        }
        return true;
    }
}
