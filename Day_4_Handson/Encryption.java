package Day_4_Handson;

import java.util.Scanner;

public class Encryption {

    static String encrypt(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = (char) (str.charAt(i) + 2);

            result += ch;
        }

        return result;
    }

    static String decrypt(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = (char) (str.charAt(i) - 2);

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next().toUpperCase();

        String encrypted = encrypt(str);

        System.out.println("Encrypted = " + encrypted);

        System.out.println("Decrypted = " + decrypt(encrypted));
    }
}
