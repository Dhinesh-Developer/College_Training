package Day_4_Handson;

import java.util.Scanner;

public class StringConcat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        String result;

        if (s1.length() > 0 && s2.length() > 0 &&
                s1.charAt(s1.length() - 1) == s2.charAt(0)) {

            result = s1 + s2.substring(1);
        } else {
            result = s1 + s2;
        }

        System.out.println(result);
    }
}
