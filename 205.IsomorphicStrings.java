class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLetters[] = new int[128];
        int tLetters[] = new int[128];

        Arrays.fill(sLetters,-1);
        Arrays.fill(tLetters,-1);

        for (int i = 0; i < s.length(); i++){

            if (sLetters[s.charAt(i)] != tLetters[t.charAt(i)])
                return false;

            sLetters[s.charAt(i)] = i;
            tLetters[t.charAt(i)] = i;
        }

        return true;
    }
}
