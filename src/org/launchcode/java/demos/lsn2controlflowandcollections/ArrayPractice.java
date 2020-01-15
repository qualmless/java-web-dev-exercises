package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayPractice {

    public static void main(String[] args) {

/*
        int[] arrayNum = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i]%2==1) {
                System.out.print(arrayNum[i]);
            }
        }
*/


        String toDivide = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayOfString = toDivide.split(" ");
        System.out.println(arrayOfString);
        System.out.println(Arrays.toString(arrayOfString));

    }
}
