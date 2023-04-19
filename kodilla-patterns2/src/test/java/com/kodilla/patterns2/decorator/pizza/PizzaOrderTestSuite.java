package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.ingredients.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {
    @Test
    void testPizzaBaseDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new SimplePizzaOrder();
        theOrder = new PizzaBaseDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();
        System.out.println("For simple pizza (base only), cost is: " + cost);

        //Then
        assertEquals(new BigDecimal(30), cost);
    }
    @Test
    void testPizzaBaseDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new SimplePizzaOrder();
        theOrder = new PizzaBaseDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        System.out.println("Order description: " + description);

        //Then
        assertEquals("Delivery service + pizza base", description);
    }
    @Test
    void testPizzaAllDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new SimplePizzaOrder();
        theOrder = new PizzaBaseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BasilDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();
        System.out.println("With all ingredients chosen, summary cost is: " + cost);

        //Then
        assertEquals(new BigDecimal(41), cost);
    }
    @Test
    void testPizzaAllDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new SimplePizzaOrder();
        theOrder = new PizzaBaseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BasilDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        System.out.println("Order description: " + description);

        //Then
        assertEquals("Delivery service + pizza base + ham + mushrooms + chicken + cheese + basil", description);
    }

}