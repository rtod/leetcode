package longestCommonPrefix;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        int size = strs.length;
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[strs.length - 1].length());
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i)) {
            i++;

        }

        String pre = strs[0].substring(0, i);
        return pre;
    }
}
