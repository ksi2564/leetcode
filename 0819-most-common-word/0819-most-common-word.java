import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();
        char[] chars = paragraph.toLowerCase().toCharArray();
        HashSet<String> set = new HashSet<>();
        
        for (String ban : banned) {
            set.add(ban);
        }
        
        for (char c : chars) {
            if (isAlpha(c)) {
                sb.append(c);
            } else {
                sb.append(' ');
            }
        }
        
        String[] arr = sb.toString().split(" ");
        System.out.println(Arrays.toString(arr));
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (s == "") continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        String answer = "";
        int max = 0;
        for (String key : map.keySet()) {
            if (!set.contains(key) && max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }
        
        return answer;
    }
    
    private boolean isAlpha(char c) {
        return ('a' <= c && c <= 'z');
    }
}