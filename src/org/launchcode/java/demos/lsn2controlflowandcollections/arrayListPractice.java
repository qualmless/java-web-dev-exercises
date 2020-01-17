package org.launchcode.java.demos.lsn2controlflowandcollections;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Arrays;
import java.util.ArrayList;

public class arrayListPractice {

    public static Object sumOfNums;
//    public static Object arrayListWordLength;
    private static Object finalWordsToCount;


    public static void main(String[] args) {
        //array list sum
        ArrayList<Integer> sumInts = new ArrayList<>();
        for (int i = 0; i<11; i++) {
            sumInts.add(i);
        }

        int sumOfNums = SumOfNums.addNums(sumInts);
        System.out.println(sumOfNums);

//array list word length
        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("banana");
        someWords.add("scarf");
        someWords.add("hat");
        someWords.add("prime");
        someWords.add("actually");
        someWords.add("black");
        someWords.add("haunt");

//        for (int i = 0; i < someWords.size(); i++) {
//            if (someWords.get(i).length() == 5) {
//                System.out.println(someWords.get(i));
////                finalWordsToCount.add(someWords.get(i));
//            }
//        }

//        ArrayList<String> arrayListWordLength = ArrayListWordLength.wordCount(finalWordsToCount);
//        System.out.println(arrayListWordLength);
        System.out.println(someWords);




    }
}
