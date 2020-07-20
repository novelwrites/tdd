package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class TestTaxCalculator {

    TaxCalculator calculator = new TaxCalculator();
    ShoppingCart taxesCart = new ShoppingCart();
    //write a test: did the tax added? (name methods that make sense according to task)

    @Test
    public void test_isCalculatorGettingData() {
        taxesCart.clearShoppingCart();
        taxesCart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected = BigDecimal.valueOf(32.99);
        BigDecimal actual = taxesCart.getItemsInCart().get(0).getItemPrice();
        assertEquals(expected, actual);

    }

    @Test
    public void test_areTaxesAndImportsBeingAdded() {
        taxesCart.clearShoppingCart();
        taxesCart.addItemToCart("Music CD", BigDecimal.valueOf(14.99), false, true);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected = BigDecimal.valueOf(14.99).multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual = taxesCart.getItemsInCart().get(0).getItemPrice();
        assertEquals(expected, actual);

        taxesCart.addItemToCart("Swiss chocolate", BigDecimal.valueOf(10.00), true, false);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected2 = BigDecimal.valueOf(10.00).multiply(BigDecimal.valueOf(1.05)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual2 = taxesCart.getItemsInCart().get(1).getItemPrice(); //knows which part of array its in
        assertEquals(expected2, actual2);

        taxesCart.addItemToCart("White Shoulders perfume", BigDecimal.valueOf(47.50), true, true);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected3 = BigDecimal.valueOf(47.50).multiply(BigDecimal.valueOf(1.15)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual3 = taxesCart.getItemsInCart().get(2).getItemPrice(); //knows which part of array its in
        assertEquals(expected3, actual3);

        taxesCart.addItemToCart("A Tale of Two Cities", BigDecimal.valueOf(12.99), false, false);
        calculator.addTaxToItemInCart(taxesCart.getItemsInCart()); //feeding the ArrayList into the cart so that we can perform the calculations on it
        BigDecimal expected4 = BigDecimal.valueOf(12.99).multiply(BigDecimal.valueOf(1.00)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal actual4 = taxesCart.getItemsInCart().get(3).getItemPrice(); //knows which part of array its in
        assertEquals(expected4, actual4);

    }
        
     @Test
     public void test_isTotalTaxAddedCorrectly() {
            taxesCart.clearShoppingCart();
            taxesCart.addItemToCart("Music CD", BigDecimal.valueOf(14.99), false, true);
            taxesCart.addItemToCart("Swiss chocolate", BigDecimal.valueOf(10.00), true, false);
            taxesCart.addItemToCart("White Shoulders perfume", BigDecimal.valueOf(47.50), true, true); 
            taxesCart.addItemToCart("A Tale of Two Cities", BigDecimal.valueOf(12.99), false, false);
            BigDecimal expected = BigDecimal.valueOf(9.12);
            BigDecimal actual = calculator.addTaxToItemInCart(taxesCart.getItemsInCart());
            assertEquals(expected, actual);

     }
        
    }


    //write a test: did price get updated?

    //Will check to see if taxable or not later - yes - done!



