package com.tdd;
import java.math.BigDecimal;
import java.util.ArrayList;

public class TaxCalculator {


    //create a new instance of ShoppingCart so I can pull things from it

ShoppingCart taxesCart = new ShoppingCart();

//need an add taxes method (dummy) needs to return a Dummy Big Decimal

public BigDecimal addTaxToItemInCart (ArrayList<Items> itemsInCart) {


    return BigDecimal.valueOf(0.0); //looking at price of item
}
}


//need to create a new Big Decimal variable for the price with taxes added to it -
//initialize it to null

//for loop (iterate through array for each item) - optional until adding multiple items
//(similar to cart class)

//then set new Big Decimal variable = item.getPrice multiplied by 1.10 (tax rate)


//Setting itemPrice to value of new Big Decimal variable - price gets updated here

