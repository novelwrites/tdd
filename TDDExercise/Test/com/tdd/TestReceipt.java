package com.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReceipt {



    @Test
    public void test_isReceiptPrintingTransaction() {
      Receipt printReceipt =  new Receipt();
      ShoppingCart receiptShoppingCart = new ShoppingCart();
      receiptShoppingCart.addItemToCart("White Shoulders perfume", BigDecimal.valueOf(47.50), true, true);
      String expected = receiptShoppingCart.getItemsInCart().get(0).getItemName() + "   Price $" + receiptShoppingCart.getItemsInCart().get(0).getItemPrice();
      String actual = printReceipt.getReceipt(receiptShoppingCart.getItemsInCart());
      assertEquals(expected, actual);
    }








}
