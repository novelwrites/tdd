package com.tdd;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Receipt {


    public void printOutTransaction(ArrayList<Items> purchasedItems, BigDecimal totalTax, BigDecimal grandTotal) {

        System.out.println("Item Name  :  Price");
        getReceipt(purchasedItems);
        System.out.println("Total Sales Tax " + totalTax);
        System.out.println("Grand Total " + grandTotal);

    }

    public String getReceipt(ArrayList<Items>purchasedItems) {
        String priceList = "";
        for (Items item : purchasedItems) {
            System.out.println(item.getItemName() + "   Price $" + item.getItemPrice());
            priceList = item.getItemName() + "   Price $" + item.getItemPrice();
        }

        return priceList;
    }
}
