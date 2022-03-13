package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Square Test Suite")
public class SquareTestSuite {

        @DisplayName("getShapeName()")
        @Test
        void TestSquareName(){
            //Given
            Shape shape = new Square();

            //When
            String expectedResult = "square";
            String result = shape.getShapeName();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }

        @DisplayName("getField()")
        @Test
        void TestSquareField(){
            //Given
            double field = 10;
            Shape shape = new Square(field);

            //When
            double expectedResult = field;
            double result = shape.getField();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }
}
