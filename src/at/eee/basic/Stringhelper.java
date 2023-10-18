package at.eee.basic;

import java.util.Scanner;

public class Stringhelper {
    static String textstring = "hallo";

    public static void main(String[] args) {
        char[] textarray = toArray(textstring);
        System.out.println(textarray[2]);
    }

    public static char[] toArray(String textstring) {
        char[] textarray = textstring.toCharArray();
        return textarray;
    }
}