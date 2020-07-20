package com.tdd;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class TestShoppingCart {


    ShoppingCart cart = new ShoppingCart();


    @Test
    public void test_isItemAdded() {
        cart.clearShoppingCart();
        cart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        String expected = "Clean Code";
        String actual = cart.findInCart("Clean Code");
        assertEquals(expected, actual);

    }

    @Test
    public void test_isShoppingCartEmpty() {
        cart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        cart.clearShoppingCart();
        int expected = 0;
        int actual = cart.getItemsInCart().size();
        assertEquals(expected, actual);


    }
}