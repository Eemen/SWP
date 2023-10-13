package at.eee.basic;

import java.sql.SQLOutput;

public class CäsarVerschlüsselung {
    public static void main(String[] args) {
        String result = encrypt(3, "hallo");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt){
        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();
        for (int i = 0; i < inputData.length; i++){
            int letter = inputData[i] + shift;
            encryptedString += Character.toString(letter);

        }
        return encryptedString;
    }


}
