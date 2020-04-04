package com.Bridgelabz.findMaximumGenerics;

public class FindMaximumOfThree {

    public static Integer maximumInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber = null;
        Integer True = 1;
        if (firstNumber.compareTo(secondNumber) == True && firstNumber.compareTo(thirdNumber) == True){
            maximumNumber=firstNumber;
        }else if (secondNumber.compareTo(firstNumber) == True && secondNumber.compareTo(thirdNumber) == True){
            maximumNumber=secondNumber;
        }else if (thirdNumber.compareTo(firstNumber) == True && thirdNumber.compareTo(secondNumber) == True){
            maximumNumber=thirdNumber;
        }
        return maximumNumber;
    }
}
