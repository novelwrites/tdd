
package com.tdd;
import java.math.BigDecimal;
import java.util.ArrayList;
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

//bring the items from Items into the arraylist.





}

    //add them one at a time

    //takes in all the same variables as items (all four)

    //add item to ShoppingCart


   // Have to write test but not returning anything -



