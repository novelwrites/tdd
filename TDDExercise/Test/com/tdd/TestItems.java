package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TestItems {
    Items item = new Items ("Clean Code", BigDecimal.valueOf(32.99), false, false);
    @Test
    public void test_getName() {
        String expected = "Clean Code";
        String actual = item.getItemName();
        assertEquals(expected, actual);

    }

    @Test
    public void test_getItemPrice() {
        BigDecimal expected = BigDecimal.valueOf(32.99);
        BigDecimal actual = item.getItemPrice();
        assertEquals(expected, actual);

    }
    @Test
    public void test_getImportable() {
        Boolean expected = Boolean.FALSE;
        Boolean actual = item.isImportable();
        assertEquals(expected, actual);

    }
    @Test
    public void test_getTaxable() {
        Boolean expected = Boolean.FALSE;
        Boolean actual = item.isTaxable();
        assertEquals(expected, actual);
    }


}
