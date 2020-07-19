package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class TestTaxCalculator {

    TaxCalculator calculator = new TaxCalculator();

    //write a test: did the tax added? (name methods that make sense according to task)

    @Test
    public void test_isCalculatorGettingData() {
        ShoppingCart taxesCart = new ShoppingCart();
        taxesCart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected = BigDecimal.valueOf(32.99);
        BigDecimal actual = taxesCart.getItemsInCart().get(0).getItemPrice();
        assertEquals(expected, actual);

    }

    @Test
    public void test_areTaxesAndImportsBeingAdded() {
        ShoppingCart taxesCart2 = new ShoppingCart();
        taxesCart2.addItemToCart("Music CD", BigDecimal.valueOf(14.99), false, true);
        calculator.addTaxToItemInCart(taxesCart2.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected = BigDecimal.valueOf(14.99).multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual = taxesCart2.getItemsInCart().get(0).getItemPrice();
        assertEquals(expected, actual);

        taxesCart2.addItemToCart("Swiss chocolate", BigDecimal.valueOf(10.00), true, false);
        calculator.addTaxToItemInCart(taxesCart2.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected2 = BigDecimal.valueOf(10.00).multiply(BigDecimal.valueOf(1.05)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual2 = taxesCart2.getItemsInCart().get(1).getItemPrice(); //knows which part of array its in
        assertEquals(expected2, actual2);


    }


    //write a test: did price get updated? (correlates to line 19 on TaxCalculator.java)

    //Will check to see if taxable or not later




}
