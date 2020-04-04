package com.Bridgelabz.findMaximumGenerics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumGenericsTest {
    FindMaximumOfThree findMaximumOfThree;
    //Test For If First Integer Is Maximum
    @Test
    public void givenInput_WhenFirstNumber_ShouldReturnMaximum() {
        int firstMaximum = findMaximumOfThree.maximumInteger(3,2,1);
        Assert.assertEquals(3,firstMaximum);
    }
    //Test For If Second Integer Is Maximum
    @Test
    public void givenInput_WhenSecondNumber_ShouldReturnMaximum() {
        int secondMaximum = findMaximumOfThree.maximumInteger(1,3,2);
        Assert.assertEquals(3,secondMaximum);
    }
    //Test For If Third Integer Is Maximum
    @Test
    public void givenInput_WhenThirdNumber_ShouldReturnMaximum() {
        int thirdMaximum = findMaximumOfThree.maximumInteger(1,2,3);
        Assert.assertEquals(3,thirdMaximum);
    }
    //Test For If First Float Is Maximum
    @Test
    public void givenInput_WhenFirstFloat_ShouldReturnMaximum() {
        Float firstMaximum = findMaximumOfThree.maximumFloat(3.3f,2.2f,1.1f);
        Assert.assertEquals((Float) 3.3f,firstMaximum);
    }
    //Test For If Second Float Is Maximum
    @Test
    public void givenInput_WhenSecondFloat_ShouldReturnMaximum() {
        Float secondMaximum = findMaximumOfThree.maximumFloat(1.1f,3.3f,2.2f);
        Assert.assertEquals((Float) 3.3f,secondMaximum);
    }
    //Test For If Third Float Is Maximum
    @Test
    public void givenInput_WhenThirdFloat_ShouldReturnMaximum() {
        Float thirdMaximum = findMaximumOfThree.maximumFloat(1.1f,2.2f,3.3f);
        Assert.assertEquals((Float) 3.3f,thirdMaximum);
    }
}
