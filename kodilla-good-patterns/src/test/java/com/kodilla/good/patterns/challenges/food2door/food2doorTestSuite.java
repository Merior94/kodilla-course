package com.kodilla.good.patterns.challenges.food2door;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class food2doorTestSuite {

    @Test
    void OrderProcessor(){
            // Given
            OrderProcessor orderProcessor = new OrderProcessor();

            OrderRequest orderRequest1 = new OrderRequest("Warzywa", 5, "ExtraFoodShop");
            OrderRequest orderRequest2 = new OrderRequest("Owoce", 5, "HealthyShop");
            OrderRequest orderRequest3 = new OrderRequest("Napoje", 5, "GlutenFreeShop");
            OrderRequest orderRequest4 = new OrderRequest("coś", 5, "Nieznany");

            // When
            boolean result1 = orderProcessor.process(orderRequest1);
            boolean result2 = orderProcessor.process(orderRequest2);
            boolean result3 = orderProcessor.process(orderRequest3);
            boolean result4 = false;
            try {
                    orderProcessor.process(orderRequest4);
            } catch (NoSuchElementException e){
                    result4 = true;
            }
            // Then
            assertTrue(result1);
            assertTrue(result2);
            assertTrue(result3);
            assertTrue(result4);
    }

}
