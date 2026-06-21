package DAy_5_Handson;

import java.util.*;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.println(firstUniqChar(s));
    }
}
