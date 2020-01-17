package org.launchcode.java.demos.lsn2controlflowandcollections;
import org.launchcode.java.demos.lsn1datatypes.Message;
import java.util.Arrays;
import java.util.ArrayList;

public class SumOfNums {

    public static int addNums(ArrayList<Integer> sumInts) {

        int sumOfNums = 0;
        for (int i = 0; i < sumInts.size(); i++) {
            if (sumInts.get(i) % 2 == 0) {
                sumOfNums += sumInts.get(i);
            }
        }
//        System.out.println(sumOfNums);
        return sumOfNums;
    }
}
