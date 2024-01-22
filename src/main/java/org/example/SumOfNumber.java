package org.example;

public class SumOfNumber {


    public int[] findTargetSum(int[] input, int target) {

        for (int i=0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

}

