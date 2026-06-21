package Day_6_Handson;

import java.util.*;

public class InfixToPostfix {

    static int precedence(char ch) {

        switch(ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    static String convert(String exp) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<exp.length();i++) {

            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            else if(ch == '(') {
                stack.push(ch);
            }

            else if(ch == ')') {

                while(!stack.isEmpty()
                        && stack.peek() != '(') {

                    result.append(stack.pop());
                }

                stack.pop();
            }

            else {

                while(!stack.isEmpty()
                        && precedence(ch)
                        <= precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        System.out.println(convert(exp));
    }
}
