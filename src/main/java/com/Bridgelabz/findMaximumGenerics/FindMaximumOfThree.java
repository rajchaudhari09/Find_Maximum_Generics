package com.Bridgelabz.findMaximumGenerics;

import java.util.Arrays;

public class FindMaximumOfThree <E extends Comparable<E>> {

    E[] arguments;

    public FindMaximumOfThree(E[] array){
        this.arguments=array;
    }
    public static <E extends Comparable<E>> E maximumFind(E... arguments){
        Arrays.sort(arguments);
        return arguments[arguments.length-1];
    }
}
