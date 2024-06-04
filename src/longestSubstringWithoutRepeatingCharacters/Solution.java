package longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static char[] add(char[] chars, char newElem) {
        int n = chars.length;
        char[] newChars = new char[n + 1];
        for (int i = 0; i < n; i++) {
            newChars[i] = chars[i];
        }
        newChars[n] = newElem;
        return newChars;
    }
}
