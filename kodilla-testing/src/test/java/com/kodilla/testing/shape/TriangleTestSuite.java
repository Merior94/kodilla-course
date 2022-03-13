package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Triangle Test Suite")
public class TriangleTestSuite {

        @DisplayName("getShapeName()")
        @Test
        void TestTriangleName(){
            //Given
            Shape shape = new Triangle();

            //When
            String expectedResult = "triangle";
            String result = shape.getShapeName();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }

        @DisplayName("getField()")
        @Test
        void TestTriangleField(){
            //Given
            double field = 10;
            Shape shape = new Triangle(field);

            //When
            double expectedResult = field;
            double result = shape.getField();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }
}
