package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TestTaxCalculator {

    TaxCalculator calculator = new TaxCalculator();

    //write a test: did the tax added? (name methods that make sense according to task)

    @Test
    public void test_isTaxAdded() {
        ShoppingCart taxesCart = new ShoppingCart();
        taxesCart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected = BigDecimal.valueOf(32.99);
        BigDecimal actual =  calculator.addTaxToItemInCart(taxesCart.getItemsInCart());
        assertEquals(expected, actual);

    }




    //write a test: did price get updated? (correlates to line 19 on TaxCalculator.java)

    //Will check to see if taxable or not later




}
