package com.tdd;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class TaxCalculator {


    //create a new instance of ShoppingCart so I can pull things from it

ShoppingCart taxesCart = new ShoppingCart();

//need an add taxes method (dummy) needs to return a Dummy Big Decimal

public BigDecimal addTaxToItemInCart (ArrayList<Items> itemsInCart) {
for(Items item : itemsInCart) { //everything in for loop tests each item one at a time in cart
    if(!item.isImportable() && item.isTaxable()) { //one specific item (Music CD)
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN));
    }
    if(item.isImportable() && !item.isTaxable()) { //one specific item (Imported Chocolate)
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.05)).setScale(2, RoundingMode.HALF_EVEN));
    }
}

    return BigDecimal.valueOf(0.0); //looking at price of item
}
}


//need to create a new Big Decimal variable for the price with taxes added to it -
//initialize it to null

//for loop (iterate through array for each item) - optional until adding multiple items
//(similar to cart class)

//then set new Big Decimal variable = item.getPrice multiplied by 1.10 (tax rate)


//Setting itemPrice to value of new Big Decimal variable - price gets updated here

