package com.Bridgelabz.findMaximumGenerics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumGenericsTest {
    FindMaximumOfThree findMaximumOfThree;
    //Test For Finding Maximum Integer
    @Test
    public void givenInput_WhenFirstNumber_ShouldReturnMaximum() {
        Integer findingMaximum = (Integer) findMaximumOfThree.maximumFind(6,4,4,8,1);
        Assert.assertEquals((Integer) 8,findingMaximum);
    }
    //Test For Finding Maximum Float
    @Test
    public void givenInput_WhenFirstFloat_ShouldReturnMaximum() {
        Float findingMaximum = (Float) findMaximumOfThree.maximumFind(3.3f,2.8f,1.1f,3.1f,2.1f);
        Assert.assertEquals((Float) 3.3f,findingMaximum);
    }
    //Test For Finding Maximum String
    @Test
    public void givenInput_WhenFirstStringMaximum_ShouldReturnMaximum() {
        String findingMaximum = (String) findMaximumOfThree.maximumFind("asdf","asdfghjkl","a","asd");
        Assert.assertEquals((String) "asdfghjkl",findingMaximum);
    }

}
