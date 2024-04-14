import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sTemp = String.valueOf(temp);
            
            ArrayList<String> tmp;
            if (map.containsKey(sTemp)) {
                tmp = map.get(sTemp);
            } else {
                tmp = new ArrayList<>();
            }
            tmp.add(str);
            map.put(sTemp, tmp);
        }
        
        System.out.println(map);
        List<List<String>> answer = new ArrayList<>();
        for (String key : map.keySet()) {
            answer.add(map.get(key));
        }
        
        return answer;
    }
}