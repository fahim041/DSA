package leetcode.backtracking;

import java.util.*;

public class l_78_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, 0, nums, list);
        return res;
    }

    public static void helper(
            List<List<Integer>> res,
            int index,
            int[] nums,
            List<Integer> list) {
        if (index >= nums.length) {
            res.add(new ArrayList<>(list));
        } else {
            list.add(nums[index]);
            helper(res, index + 1, nums, list);

            list.remove(list.size() - 1);
            helper(res, index + 1, nums, list);
        }
    }
}
