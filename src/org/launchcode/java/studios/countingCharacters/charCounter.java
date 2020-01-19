package org.launchcode.java.studios.countingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charCounter {
    public static final String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    public static void main(String[] args) {
        Map<Character, Integer> countedChars = countCharacters(hiddenFigures);

        System.out.println("Counting characters!");
        for (Map.Entry<Character, Integer> countedChar : countedChars.entrySet()) {
            System.out.println(countedChar.getKey() + ": " + countedChar.getValue());
        }
    }

    private static Map<Character, Integer> countCharacters(String inputText) {
        char[] hiddenArray = inputText.toCharArray();
        Map<Character, Integer> countedChars = new HashMap<>();

        for (char currentLetter : hiddenArray) {
            System.out.println(currentLetter);
            if (Character.isLetter(currentLetter)) {
                if (countedChars.containsKey(currentLetter)) {
                    int currentVal = countedChars.get(currentLetter);
                    countedChars.put(currentLetter, currentVal++);
                }
                else {
                    countedChars.put(currentLetter, 0);
                }
            }
        }
        return countedChars;
    }
}