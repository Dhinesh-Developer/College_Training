package DAy_5_Handson;

import java.util.*;

public class GoodWords {

    static boolean canForm(String word,
                           String chars) {

        int[] count = new int[26];

        for(char ch : chars.toCharArray()) {
            count[ch-'a']++;
        }

        for(char ch : word.toCharArray()) {

            if(count[ch-'a'] == 0)
                return false;

            count[ch-'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }

        String chars = sc.next();

        int sum = 0;

        for(String word : words) {

            if(canForm(word, chars))
                sum += word.length();
        }

        System.out.println(sum);
    }
}