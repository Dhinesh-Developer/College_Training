package DAy_5_Handson;

import java.util.*;

public class AcronymCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }

        String s = sc.next();

        String acronym = "";

        for(String word : words) {
            acronym += word.charAt(0);
        }

        System.out.println(
                acronym.equals(s));
    }
}
