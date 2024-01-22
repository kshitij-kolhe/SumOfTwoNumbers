package org.example;

public class Main {
    public static void main(String[] args) {

        int[] input = {2, 7, 11, 16};
        int target = 9;

        SumOfNumber sumOfNumber = new SumOfNumber();
        int[] resultPair = sumOfNumber.findTargetSum(input, target);

        if (resultPair.length > 0) {
            System.out.println("First index: " + resultPair[0]);
            System.out.println("Second index: " + resultPair[1]);
        }
    }
}