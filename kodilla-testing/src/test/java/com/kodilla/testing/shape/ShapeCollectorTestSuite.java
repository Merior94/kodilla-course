package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @DisplayName("showFigures()")
    @Test
    void TestShapeShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(new Triangle());
        shapeCollector.addShape(new Square());
        shapeCollector.addShape(new Circle());

        //When
        String result = shapeCollector.showFigures();
        String expectedResult = "triangle square circle";

        //Then
        Assertions.assertEquals(expectedResult,result);
    }

    @Nested
    @DisplayName("getFigure()")
    class TestShapeGetFigure{
        @DisplayName("emptyList")
        @Test
        void TestGetEmpty() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null,result);
        }

        @DisplayName("Triangle")
        @Test
        void TestGetTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }

        @DisplayName("Square")
        @Test
        void TestGetSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }

        @DisplayName("Circle")
        @Test
        void TestGetCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }
    }

    @Nested
    @DisplayName("addFigure()")
    class TestShapeAddFigure{

        @DisplayName("Triangle")
        @Test
        void TestAddTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }

        @DisplayName("Square")
        @Test
        void TestAddSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }

        @DisplayName("Circle")
        @Test
        void TestAddCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();

            //When
            shapeCollector.addShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,result);
        }
    }

    @Nested
    @DisplayName("removeFigure()")
    class TestShapeRemoveFigure{

        @DisplayName("emptyList")
        @Test
        void TestRemoveEmpty(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle();

            //When
            shapeCollector.removeShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null,result);
        }

        @DisplayName("Triangle")
        @Test
        void TestRemoveTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle();
            shapeCollector.addShape(shape);

            //When
            shapeCollector.removeShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null,result);
        }

        @DisplayName("Square")
        @Test
        void TestRemoveSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            shapeCollector.addShape(shape);

            //When
            shapeCollector.removeShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null,result);
        }

        @DisplayName("Circle")
        @Test
        void TestRemoveCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            shapeCollector.addShape(shape);

            //When
            shapeCollector.removeShape(shape);
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null,result);
        }
    }
}
