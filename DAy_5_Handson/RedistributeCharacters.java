package DAy_5_Handson;

import java.util.*;

public class RedistributeCharacters {

    public static boolean makeEqual(
            String[] words) {

        int[] freq = new int[26];

        for(String word : words) {

            for(char ch :
                    word.toCharArray()) {

                freq[ch-'a']++;
            }
        }

        int n = words.length;

        for(int count : freq) {

            if(count % n != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words =
                new String[n];

        for(int i=0;i<n;i++) {
            words[i] = sc.next();
        }

        System.out.println(
                makeEqual(words));
    }
}
