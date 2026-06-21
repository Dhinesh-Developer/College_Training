package Day_3_Handson_2;

import java.util.*;

public class LongestValidParentheses {

    static int longestValid(String s) {

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {

                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(longestValid(str));
    }
}
