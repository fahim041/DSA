package leetcode.stack;

import java.util.Stack;

public class l_739_daily_temperatures {
    public static int[] dailyTemperatures(int[] t){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[t.length];

        for(int i = 0; i < t.length; i++){
            while(!stack.isEmpty() && t[stack.peek()] < t[i]){
                int j = stack.pop();
                res[j] = i - j;
            }
            stack.push(i);
        }
        return res;
    }
}
