import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> counter = new HashMap<>(); // character 당 개수 체크
        HashMap<Character, Boolean> seen = new HashMap<>(); // 스택에 character에 해당하는 값이 있는지 확인
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s.toCharArray()) {
            counter.put(c, counter.get(c) - 1);
            // stack에 값이 들어가 있으면 검사해볼 필요없이 넘김
            if (seen.get(c) != null && seen.get(c) == true) {
                continue;
            }
            // 스택 마지막 값이 현재 문자보다 크고, 스택 마지막 값과 동일한 값이 더 있으면 없애도 된다.
            while (!stack.isEmpty() && stack.peek() > c && counter.get(stack.peek()) > 0) {
                seen.put(stack.pop(), false);
            }
            stack.push(c);
            seen.put(c, true);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        
        return sb.toString();
    }
}