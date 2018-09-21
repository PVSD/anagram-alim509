package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        boolean result = false;
        char[] wordArray;
        char[] anagramArray;
        System.out.println("Type in any word. Press enter. Type in another word that is an anagram of the first word.");
        String word = kbInput.next();
        System.out.println("Now type in the anagram.");
        String anagram = kbInput.next();
        wordArray = word.toLowerCase().toCharArray();
        anagramArray = anagram.toLowerCase().toCharArray();
        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        if (word.length() != anagram.length()) {

            result = false;

        } else {

            for (int i = 0; i < word.length(); i++) {

                if (wordArray[i] != anagramArray[i]) {

                    result = false;

                } else {

                    result = true;

                }

            }

        }

        if (word.equals(anagram)) {

            System.out.println("That is the same word!");

        } else if (result == true) {

            System.out.println("You got it! That is an anagram of " + word + "! Congratulations!");

        } else {

            System.out.println("That is not an anagram of " + word + ".");

        }

        main(null);

    }

}
