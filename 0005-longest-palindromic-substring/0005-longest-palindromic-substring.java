import java.util.*;

class Solution {
    int start = 0, max = 0;
    
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        for (int i = 0; i < s.length(); i++) {
            palindromic(s, i, i + 1); // two length window
            palindromic(s, i, i + 2); // three length window
        }
        
        return s.substring(start, start + max);
    }
    
    private void palindromic(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        if (max < right - left - 1) {
            max = right - left - 1;
            start = left + 1;
            System.out.println("max = " + max);
            System.out.println("start = " + start);
        }
    }
}