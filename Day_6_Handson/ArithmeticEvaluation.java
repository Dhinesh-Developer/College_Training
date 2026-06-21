package Day_6_Handson;

import java.util.*;

public class ArithmeticEvaluation {

    static int apply(int a, int b, char op) {

        switch(op) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;
        }

        return 0;
    }

    static int evaluate(String exp) {

        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i=0;i<exp.length();i++) {

            char ch = exp.charAt(i);

            if(ch == ' ')
                continue;

            if(ch == '(') {
                ops.push(ch);
            }

            else if(Character.isDigit(ch)) {

                int num = 0;

                while(i < exp.length()
                        && Character.isDigit(exp.charAt(i))) {

                    num = num * 10 +
                            (exp.charAt(i) - '0');

                    i++;
                }

                i--;

                values.push(num);
            }

            else if(ch == ')') {

                while(ops.peek() != '(') {

                    int b = values.pop();
                    int a = values.pop();

                    values.push(
                            apply(a,b,ops.pop()));
                }

                ops.pop();
            }

            else {

                while(!ops.isEmpty()
                        && ops.peek() != '(') {

                    int b = values.pop();
                    int a = values.pop();

                    values.push(
                            apply(a,b,ops.pop()));
                }

                ops.push(ch);
            }
        }

        return values.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        System.out.println(evaluate(exp));
    }
}
