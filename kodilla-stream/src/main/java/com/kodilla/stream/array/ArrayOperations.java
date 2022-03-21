package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {

    public static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        return average;
    }
}
