package misson2_1;

public class M1 {

    public static void main(String[] args) {

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (char c : alphabet) {
            System.out.print(c);
        }
    }


}
