import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> digitLogs = new ArrayList<>();
        ArrayList<String> letterLogs = new ArrayList<>();
        String[] answer = new String[logs.length];
        
        for (String log : logs) {
            if (Character.isDigit(log.split(" ", 2)[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        
        letterLogs.sort((s1, s2) -> {
            String[] arr1 = s1.split(" ", 2);
            String[] arr2 = s2.split(" ", 2);
            
            if (arr1[1].compareTo(arr2[1]) == 0) {
                return arr1[0].compareTo(arr2[0]);
            }
            
            return arr1[1].compareTo(arr2[1]);
        });
        
        for (int i = 0; i < letterLogs.size(); i++) {
            answer[i] = letterLogs.get(i);
        }
        for (int i = 0; i < digitLogs.size(); i++) {
            answer[letterLogs.size() + i] = digitLogs.get(i);
        }
        
        return answer;
    }
}