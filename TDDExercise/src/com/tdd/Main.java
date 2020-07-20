package com.tdd;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        //Input1
        cart.addItemToCart("Clean Code", BigDecimal.valueOf(12.49), false, false);
        cart.addItemToCart("Sweet Baby James CD", BigDecimal.valueOf(14.99), false, true);
        cart.addItemToCart("Hershey Bar", BigDecimal.valueOf(.085), false, false);
        //Input2
        cart.addItemToCart("Fancy Imported Chocolates", BigDecimal.valueOf(10.00), true, false);
        cart.addItemToCart("Fancy Imported Perfume", BigDecimal.valueOf(47.50), true, true);
        //Input3
        cart.addItemToCart("Not So Fancy Imported Perfume", BigDecimal.valueOf(32.19), true, true);
        cart.addItemToCart("Just A Bottle of Perfume", BigDecimal.valueOf(20.89), false, true);
        cart.addItemToCart("Ibuprofen", BigDecimal.valueOf(9.75), false, false);
        cart.addItemToCart("Fancier Imported Chocolates", BigDecimal.valueOf(11.25), true, false);
    }

}
