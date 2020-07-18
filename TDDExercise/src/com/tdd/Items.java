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
    public String getItemName() {
        return itemName;
    }

    public BigDecimal getItemPrice() {
        return BigDecimal.valueOf(0);
    }

    public Boolean getImportable() {
        return true;
    }

    public Boolean getTaxable() {
        return true;
    }

    /*public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }*/

}


