package leetcode.dp;

class l_647_palindromic_substrings {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += count(s, i, i);
            res += count(s, i, i + 1);
        }

        return res;
    }

    public static int count(String s, int left, int right) {
        int res = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            res += 1;
            left--;
            right++;
        }

        return res;
    }
}