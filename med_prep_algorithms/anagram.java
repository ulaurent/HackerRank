/* A program that checks to see if two words are anagrams of each other */

package com.company;

public class Main {

    public static void main(String[] args) {
        anagram("listen", "silent");
    }

    // Method that takes in to strings to check if they are anagrams of each other
    public static void anagram(String first, String second) {
        // In order for a word to be an anagram of another, they must be the same length
        if (first.length() != second.length()) {
            System.out.println("Words Fail Test");
        } else {
            // Now passed that, Make sure the whole word is to lowercase before you compare
            String firstIn = first.toLowerCase();
            String secondIn = second.toLowerCase();

            // Now break them up into array of characters each
            int wordCount = 0;
            char[] firstarray = firstIn.toCharArray();
            char[] secondarray = secondIn.toCharArray();

            for (int i = 0; i < firstarray.length; i++) {
                for (int j = 0; j < secondarray.length; j++) {
                    if (firstarray[i] == secondarray[j]) {
                        wordCount++;
                    }
                }
            }

            // If wordcount equals length of any character array, Program passes
            if (wordCount == firstarray.length) {
                System.out.println("Your two words are anagrams of each other");
            }
            else{
                System.out.println("Programmed Failed");
            }
        }
    }
}
