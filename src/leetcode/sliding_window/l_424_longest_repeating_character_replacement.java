package leetcode.sliding_window;

public class l_424_longest_repeating_character_replacement {
    public static int characterReplacement(String s, int k){
        int[] count = new int[26];
        int l = 0, r = 0;
        int max = 0, res = 0;

        while(r < s.length()){
            count[s.charAt(r) - 'A']++;
            max = Math.max(max, count[s.charAt(r) - 'A']);

            if(r - l + 1 - max > k){
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}
