package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    void before(){
        System.out.println("Testing case");
    }

    @AfterEach
    void after(){
        System.out.println("Finished case\n");
    }

    @DisplayName("Test odd numbers exterminator when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        System.out.println("Test odd numbers exterminator when list is empty");
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> givenList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();

        //When
        List<Integer> resultList = ext.exterminate(givenList);

        //Then
        Assertions.assertEquals(expectedList, resultList);
    }

    @DisplayName("Test odd numbers exterminator when list is not empty")
    @Test
    void testOddNumbersExterminatorNormalList(){
        System.out.println("Test odd numbers exterminator when list is not empty");
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
//        List<Integer> givenList = new ArrayList<>();
//        List<Integer> expectedList = new ArrayList<>();
//        Generate lists
//        for(int i=0; i<10; i++){
//            givenList.add(i);
//            if (i%2!=0) {
//                expectedList.add(i);
//            }
//        }

        Integer[] givenArray = new Integer[] {10,11,13,15,17,19,20,21,30,40};
        List<Integer> givenList = Arrays.asList(givenArray);

        Integer[] expectedArray = new Integer[] {10,20,30,40};
        List<Integer> expectedList = Arrays.asList(expectedArray);

        //When
        List<Integer> resultList = ext.exterminate(givenList);

        //Then
        Assertions.assertEquals(expectedList, resultList);
    }
}
