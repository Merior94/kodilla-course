package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("10"), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa", description);
    }

    @Test
    public void testCheesePizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        // When
        BigDecimal cost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("14"), cost);
    }

    @Test
    public void testCheesePizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa + ser", description);
    }

    @Test
    public void testSalamiPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        // When
        BigDecimal cost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("15"), cost);
    }

    @Test
    public void testSalamiPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa + salami", description);
    }

    @Test
    public void testCheeseSalamiPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        // When
        BigDecimal cost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("19"), cost);
    }

    @Test
    public void testCheeseSalamiPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa + ser + salami", description);
    }

    @Test
    public void testCornCheeseSalamiPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CornPizzaOrderDecorator(theOrder);
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);

        // When
        BigDecimal cost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("22"), cost);
    }

    @Test
    public void testCornCheeseSalamiPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CornPizzaOrderDecorator(theOrder);
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);

        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa + kukurydza + ser + salami", description);
    }

    @Test
    public void testCornCheeseSalamiExpressPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CornPizzaOrderDecorator(theOrder);
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        theOrder = new ExpressPizzaOrderDecorator(theOrder);

        // When
        BigDecimal cost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal("32"), cost);
    }

    @Test
    public void testCornCheeseSalamiExpressPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CornPizzaOrderDecorator(theOrder);
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new SalamiPizzaOrderDecorator(theOrder);
        theOrder = new ExpressPizzaOrderDecorator(theOrder);

        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza podstawowa + kukurydza + ser + salami + szybka dostawa", description);
    }


}
