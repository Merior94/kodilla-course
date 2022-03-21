package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArrayOperationsTestSuite {

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4.5, new int[]{0,1,2,3,4,5,6,7,8,9}),
                arguments(100.0, new int[]{100,100,100,100,100}),
                arguments(500.0, new int[]{100,900}),
                arguments(333.666, new int[]{100,900,1})
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testGetAverage(double expectedResult, int[] numbers){
        //Given
        //int[] numbers = new int[]{0,1,2,3,4,5,6,7,8,9};

        //When
        double result = ArrayOperations.getAverage(numbers);
        //double expectedResult = 4.5;

        //Then
        assertEquals(expectedResult, result, 0.001);

    }
}
