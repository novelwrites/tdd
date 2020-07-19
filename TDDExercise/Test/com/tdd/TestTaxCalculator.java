package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TestTaxCalculator {

    TaxCalculator calculator = new TaxCalculator();

    //write a test: did the tax added? (name methods that make sense according to task)

    @Test
    public void test_isTaxAdded() {
        calculator.addTaxToItemInCart();
        BigDecimal expected = BigDecimal.valueOf(0);
        BigDecimal actual =  calculator.itemTax;
        assertEquals(expected, actual );

    }




    //write a test: did price get updated? (correlates to line 19 on TaxCalculator.java)

    //Will check to see if taxable or not later




}
