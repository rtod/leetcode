package palindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        var inverse = 0;
        var copy = x;
        while (copy > 0) {
            var s = copy % 10;
            inverse = inverse * 10 + s;
            copy = copy / 10;
        }
        return x == inverse;
    }
}
