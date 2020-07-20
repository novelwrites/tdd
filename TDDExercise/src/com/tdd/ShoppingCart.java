
package com.tdd;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class ShoppingCart {

//take in all of the products into an array -

private ArrayList<Items> itemsInCart = new ArrayList<>();


//Method adds item to cart by creating an instance of the item and setting our variables.
    public void addItemToCart (String itemName, BigDecimal itemPrice, Boolean importable, Boolean taxable) {
Items item = new Items(itemName, itemPrice, importable, taxable);
itemsInCart.add(item);
    }
public String findInCart(String itemName) {
    //Looking for a single item in shopping cart array

    for(Items item : itemsInCart) {
            if(item.getItemName().equals(itemName)){
                return item.getItemName();   //has to return ACTUAL item name
            }

        }

        return "item not found";

}

public void clearShoppingCart() {
        this.itemsInCart.clear();
}

    public ArrayList<Items> getItemsInCart() {

    }
}

