class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (true) {
            if ((i < 0) || ((s.charAt(i) == ' ')&&(length != 0))){
                return length;
            }else if (s.charAt(i) != ' '){
                length ++;
            }
            i --;
        }
    }
}
