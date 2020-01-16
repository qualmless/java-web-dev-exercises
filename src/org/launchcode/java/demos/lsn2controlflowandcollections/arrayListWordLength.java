package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class arrayListWordLength {

    public static ArrayList<String> wordCount (ArrayList<String> someWords) {

        ArrayList<String> finalWordsToCount = null;

        for (int i = 0; i < someWords.size(); i++) {
            if (someWords.get(i).length() == 5) {
                finalWordsToCount.add(someWords.get(i));
//                System.out.println(someWords.get(i));
            }
        }
//        System.out.println(sumOfNums);
        return finalWordsToCount;
    }
}
