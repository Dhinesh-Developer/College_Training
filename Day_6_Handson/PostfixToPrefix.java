package Day_6_Handson;

import java.util.*;

public class PostfixToPrefix {

    static String convert(String exp) {

        Stack<String> stack = new Stack<>();

        for(int i=0;i<exp.length();i++) {

            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)) {

                stack.push(ch + "");
            }
            else {

                String op2 = stack.pop();
                String op1 = stack.pop();

                String temp =
                        ch + op1 + op2;

                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        System.out.println(convert(exp));
    }
}
