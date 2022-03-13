package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Circle Test Suite")
public class CircleTestSuite {

        @DisplayName("getShapeName()")
        @Test
        void TestCircleName(){
            //Given
            Shape shape = new Circle();

            //When
            String expectedResult = "circle";
            String result = shape.getShapeName();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }

        @DisplayName("getField()")
        @Test
        void TestCircleField(){
            //Given
            double field = 10;
            Shape shape = new Circle(field);

            //When
            double expectedResult = field;
            double result = shape.getField();

            //Then
            Assertions.assertEquals(expectedResult,result);
        }
}
