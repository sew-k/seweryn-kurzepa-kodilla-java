package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sesameBun(true)
                .burgers(2)
                .sauce("1000-islands")
                .ingredients("becon", "cheese", "salad")
                .build();
        System.out.println(bigmac);

        //When & Then
        Assertions.assertTrue(bigmac.isSesameBun());
        Assertions.assertEquals(2, bigmac.getBurgers());
        Assertions.assertEquals("1000-islands", bigmac.getSauce());
        Assertions.assertEquals(3, bigmac.getIngredients().size());
        Assertions.assertTrue(bigmac.getIngredients().contains("becon"));
        Assertions.assertTrue(bigmac.getIngredients().contains("cheese"));
        Assertions.assertTrue(bigmac.getIngredients().contains("salad"));
    }
}
