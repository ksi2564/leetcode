import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!isAlphaOrNum(chars[left])) {
                left++;
            }
            if (!isAlphaOrNum(chars[right])) {
                right--;
            }
            if (isAlphaOrNum(chars[left]) && isAlphaOrNum(chars[right])) {
                if (chars[left] != chars[right]) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    private boolean isAlphaOrNum(char c) {
        if (('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
            return true;
        }
        return false;
    }
}