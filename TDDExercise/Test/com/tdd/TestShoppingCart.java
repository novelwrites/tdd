package com.tdd;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class TestShoppingCart {


    ShoppingCart cart = new ShoppingCart();


    @Test
    public void test_isItemAdded() {
        cart.addItemToCart("Clean Code", BigDecimal.valueOf(32.99), false, false);
        String expected = "Clean Code";
        String actual = cart.findInCart("Clean Code");
        assertEquals(expected, actual);

    }




}
