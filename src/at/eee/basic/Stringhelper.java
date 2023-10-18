package at.eee.basic;

import java.util.Scanner;

public class Stringhelper {
    static String textstring = "hallah";

    public static void main(String[] args) {
        char[] textarray = toArray(textstring);
        if (isPalindrome(textarray)) {
            System.out.println("Das Wort ist ein Palindrom.");
        } else {
            System.out.println("Das Wort ist kein Palindrom.");
        }
    }

    public static char[] toArray(String textstring) {
        char[] textarray = textstring.toCharArray();
        return textarray;
    }

    public static boolean isPalindrome(char[] textarray) {
        int start = 0;
        int end = textarray.length - 1;

        while (start < end) {
            if (textarray[start] != textarray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
