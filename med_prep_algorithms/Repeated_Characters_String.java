/* A beautiful "Fine repeated characters and how many times" Program using the profound data structure 'HashMap' */

package com.company;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Character, Integer> myHash = new HashMap<>();

        printCharactersAndAmount("programming");
    }

    public static void printCharactersAndAmount(String str){
        // Split the string into an array of characters
        // This is a consistent theme when working and handling strings
        char [] characters = str.toCharArray();

        HashMap <Character, Integer> myHash = new HashMap<>();

        // Fill up our new Hashmap
        for (Character i: characters) {
            // If character is in Hashmap already, find where object key is, and increase value by 1
            if (myHash.containsKey(i)){
                myHash.put(i, myHash.get(i) + 1);
            }
            else{
                myHash.put(i, 1);
            }
        }

        // Now iterate through Hashmap

        for (HashMap.Entry<Character,Integer> entry: myHash.entrySet()){
            if (entry.getValue() > 1){
                System.out.println("Letter repeated: "+ entry.getKey()+ " How many Times: "+ entry.getValue());
            }
        }
    }
}
