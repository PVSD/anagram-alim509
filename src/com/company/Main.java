package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        boolean length = false;
        boolean characters = false;
        System.out.println("Type in any word. Press enter. Type in another word that is an anagram of the first word.");
        String word = kbInput.next();
        System.out.println("Now type in the anagram.");
        String anagram = kbInput.next();

        int wordLength = word.length();
        int anagramLength = anagram.length();

        if (wordLength == anagramLength) {

            length = true;

        } else {

            length = false;

        }


        if (length == false) {

            System.out.println("That is not an anagram. Goodbye.");

        } else {

            char[] wordArray = word.toLowerCase().toCharArray();
            char[] anagramArray = anagram.toLowerCase().toCharArray();

            Arrays.sort(wordArray);
            Arrays.sort(anagramArray);

            if (wordArray == anagramArray) {

                characters = true;

            }

        }

        if (characters == true) {

            System.out.println("That is an anagram! Congratulations!");

        } else {

            System.out.println("That is not an anagram. Goodbye.");

        }

    }
}
