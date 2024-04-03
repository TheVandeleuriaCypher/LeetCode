import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String patternLetters[] = new String[26];
        Set<String> usedWords = new HashSet<>();
        String words[] = s.split(" ");
        Arrays.fill(patternLetters, "");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            int index = pattern.charAt(i) - 'a';
            System.out.println(patternLetters[index]);
            System.out.println(words[i]);
            if (patternLetters[index].equals("")) {
                if (!usedWords.contains(words[i])) {
                    patternLetters[index] = words[i];
                    usedWords.add(words[i]);
                } else {
                    return false; // Word already used for a different pattern character
                }
            } else if (!patternLetters[index].equals(words[i])) {
                return false;
            }
            
        }
        return true;
    }
}
