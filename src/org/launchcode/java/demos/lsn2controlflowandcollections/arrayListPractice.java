package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;
import java.util.ArrayList;

public class arrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> sumInts = new ArrayList<>();
        sumInts.add(1);
        sumInts.add(2);
        sumInts.add(3);
        sumInts.add(4);
        sumInts.add(5);
        sumInts.add(6);
        sumInts.add(7);
        sumInts.add(8);
        sumInts.add(9);
        sumInts.add(10);

        int sumOfNums = 0;
        for (int i = 0; i < sumInts.size(); i++) {
            if (sumInts.get(i) % 2 == 0 ) {
                sumOfNums += sumInts.get(i);
            }
        }
        System.out.println(sumOfNums);

    }
}
