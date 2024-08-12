package com.tarv07.inventory.view;

import com.tarv07.inventory.model.Item;

import java.util.List;

public class InventoryView {
    //show messages
    public void displayMessage (String message){
        System.out.println(message);
    }

    //info on single item
    public void displayItem (Item item){
        if(item != null){
            System.out.println("Item Details:");
            System.out.println("ID: " + item.getId());
            System.out.println("Name: " + item.getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: $" + item.getPrice());
        }else{
            System.out.println("Item not found.");
        }
    }

    //show list of items
    public void displayItems (List<Item> items) {
        if(items.isEmpty()){
            System.out.println("No items to display.");
        }else{
            System.out.println("Inventory List:");
            for(Item item : items){
                System.out.println("------------------------");
                displayItem(item);
            }
        }
    }
}
