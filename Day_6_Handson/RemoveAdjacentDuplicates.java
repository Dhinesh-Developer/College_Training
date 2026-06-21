package Day_6_Handson;

import java.util.*;

public class RemoveAdjacentDuplicates {

    static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(!stack.isEmpty()
                    && stack.peek() == ch) {

                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }

        StringBuilder result =
                new StringBuilder();

        for(char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(
                removeDuplicates(s));
    }
}
