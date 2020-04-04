package com.Bridgelabz.findMaximumGenerics;

import java.util.Arrays;

public class FindMaximumOfThree <E extends Comparable<E>> {
    // Array Arguments Of Type E
    E[] arguments;
    // Constructor For Initialization Of Array The Elements
    public FindMaximumOfThree(E[] array){
        this.arguments=array;
    }
    //Method For The Finding For A Maximum In Given Array
    public static <E extends Comparable<E>> E maximumFind(E... arguments){
        Arrays.sort(arguments);
        E maximum = arguments[arguments.length-1];
        printMaximum(maximum);
        return arguments[arguments.length-1];
    }
    //Method For The Printing For A Maximum Given In Array
    private static <E extends Comparable<E>> void printMaximum(E maximum) {
        System.out.println("Maximum Sort The Array Is:"+maximum);
    }
}
