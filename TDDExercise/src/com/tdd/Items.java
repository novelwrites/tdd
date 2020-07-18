package com.tdd;


import java.math.BigDecimal;

public class Items {

String itemName;
BigDecimal itemPrice;
Boolean importable;
Boolean taxable;

    public Items(String itemName, BigDecimal itemPrice, Boolean importable, Boolean taxable) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.importable = importable;
        this.taxable = taxable;
    }
public String getItemName () {

        return "item name";

}

}
