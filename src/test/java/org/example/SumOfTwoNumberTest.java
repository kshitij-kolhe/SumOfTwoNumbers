package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class SumOfTwoNumberTest {

    private SumOfNumber sumOfNumber;
    private Random random;
    private int size;
    private int[] input;

    @Before
    public void setUp() {
     sumOfNumber = new SumOfNumber();
     random = new Random();
     size = random.nextInt(15, 40);
     input = random.ints(size, 4, 50).toArray();
    }

    @Test
    public void returnArrayOfSizeTwoWhenTargetSumIsPresent() {
        final int a = random.nextInt(60, 70);
        final int b = random.nextInt(80, 90);
        final int expectedIndexA = random.nextInt(0, size/2);
        final int expectedIndexB = random.nextInt(size/2 + 1, size);
        final int expectedTarget  = a + b;
        input[expectedIndexA] = a;
        input[expectedIndexB] = b;


        final int[] actualResult =  sumOfNumber.findTargetSum(input, expectedTarget);

        Assert.assertEquals(2, actualResult.length);
        Assert.assertEquals(expectedIndexA, actualResult[0]);
        Assert.assertEquals(expectedIndexB, actualResult[1]);
        Assert.assertEquals(expectedTarget, input[actualResult[1]] + input[actualResult[0]]);
    }

    @Test
    public void returnEmptyArrayWhenTargetSumIsNotPresent() {
        final int expectedTarget = 0;

        final int[] actualResult =  sumOfNumber.findTargetSum(input, expectedTarget);

        Assert.assertEquals(0, actualResult.length);
    }
}
