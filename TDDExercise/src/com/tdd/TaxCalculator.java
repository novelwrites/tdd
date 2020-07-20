package com.tdd;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class TaxCalculator {


    //create a new instance of ShoppingCart so I can pull things from it

ShoppingCart taxesCart = new ShoppingCart();

//need an add taxes method (dummy) needs to return a Dummy Big Decimal

public BigDecimal addTaxToItemInCart (ArrayList<Items> itemsInCart) {

    BigDecimal totalTax = BigDecimal.valueOf(0);

for(Items item : itemsInCart) { //everything in for loop tests each item one at a time in cart
    if(!item.isImportable() && item.isTaxable()) { //one specific item (taxable)
        totalTax = totalTax.add(item.getItemPrice().multiply(BigDecimal.valueOf(0.10)).setScale(2, RoundingMode.HALF_EVEN));
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.10)).setScale(2, RoundingMode.HALF_EVEN));
    }
    if(item.isImportable() && !item.isTaxable()) { //one specific item (import duty)
        totalTax = totalTax.add(item.getItemPrice().multiply(BigDecimal.valueOf(0.05)).setScale(2, RoundingMode.HALF_EVEN));
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.05)).setScale(2, RoundingMode.HALF_EVEN));
    }
    if(item.isImportable() && item.isTaxable()) { //one specific item (taxable and import duty)
        totalTax = totalTax.add(item.getItemPrice().multiply(BigDecimal.valueOf(0.15)).setScale(2, RoundingMode.HALF_EVEN));
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.15)).setScale(2, RoundingMode.HALF_EVEN));
    }
    //I know I could have just said else below, but this is a learning experience for me and this helps me
    //understand better what I am doing for each condition :)
    if(!item.isImportable() && !item.isTaxable()) { //one specific item (no tax and no import duty)
        item.setItemPrice(item.getItemPrice().multiply(BigDecimal.valueOf(1.00)).setScale(2, RoundingMode.HALF_EVEN));
    }

}

    return totalTax; //looking at price of item
}
}



