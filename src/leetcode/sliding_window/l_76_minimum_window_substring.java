package leetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class l_76_minimum_window_substring {
    public static String minWindow(String s, String t){
        Map<Character, Integer> map = new HashMap<>();

        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int l = 0;
        int subStr = 0;
        int minLen = s.length() + 1;

        for(int r = 0; r < s.length(); r++){
            char curr = s.charAt(r);
            if(map.containsKey(curr)){
                map.put(curr, map.get(curr) - 1);
                if(map.get(curr) == 0)
                    matched++;
            }

            while(matched == map.size()) {
                if (minLen > r - l + 1) {
                    minLen = r - l + 1;
                    subStr = l;
                }

                char deleted = s.charAt(l++);
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0)
                        matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}
